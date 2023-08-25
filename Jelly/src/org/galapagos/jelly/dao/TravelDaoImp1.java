package org.galapagos.jelly.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.galapagos.jelly.common.JDBCUtil;
import org.galapagos.jelly.vo.Region;
import org.galapagos.jelly.vo.TravelVO;

public class TravelDaoImp1 implements TravelDAO {
	Connection conn = JDBCUtil.getConnection();

	private TravelDaoImp1() {
	}

	private static TravelDaoImp1 dao = new TravelDaoImp1();

	public static TravelDAO getInstance() {
		return dao;
	}

	@Override
	public int getTotalCount() {

		// 단일행 쿼리, 데이터 없을 때도 0
		String sql = "SELECT COUNT(*) TOTAL_COUNT FROM TRAVEL";

		try (PreparedStatement stmt = conn.prepareStatement(sql)) {

			try (ResultSet rs = stmt.executeQuery()) {
				rs.next();
				return rs.getInt("TOTAL_COUNT");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public List<TravelVO> getPage(int start, int end) {
		String sql = "SELECT * FROM TRAVEL_VIEW " + "WHERE SEQ BETWEEN ? AND ?";
		List<TravelVO> list = new ArrayList<>();

		try (PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setInt(1, start);
			stmt.setInt(2, end);

			mapList(list, stmt);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public List<Region> getRegions() {
		String sql = "SELECT REGION, COUNT(*) COUNT FROM TRAVEL " + "GROUP BY REGION " + "ORDER BY COUNT ASC";
		List<Region> list = new ArrayList<>();

		try (PreparedStatement stmt = conn.prepareStatement(sql)) {

			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					Region region = new Region();

					region.setRegion(rs.getString("region"));
					region.setCount(rs.getInt("count"));
					list.add(region);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;

	}

	@Override
	public List<TravelVO> getSpots(String region) {

		String sql = "SELECT * FROM TRAVEL t " + "WHERE REGION = ? " + "ORDER BY TITLE";
		List<TravelVO> list = new ArrayList<>();

		try (PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, region);

			mapList(list, stmt);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;

	}

	@Override
	public List<TravelVO> search(String keyword) {

		String sql = "SELECT * FROM TRAVEL t " + "WHERE TITLE LIKE ? OR DESCRIPTION LIKE ? " + "ORDER BY REGION, TITLE";
		List<TravelVO> list = new ArrayList<>();

		try (PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, keyword);
			stmt.setString(2, keyword);
			mapList(list, stmt);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;

	}

	@Override
	public TravelVO findById(int no) {
		String sql = "SELECT * FROM TRAVEL WHERE NO = ?";

		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, no);
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					return map(rs);
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	private TravelVO map(ResultSet rs) throws SQLException {
		TravelVO travel = TravelVO.builder() // 빌더 얻기
				.address(rs.getString("address")) // address 컬럼
				.region(rs.getString("region")) // region 컬럼
				.no(rs.getInt("no")) // no 컬럼
				.phone(rs.getString("phone")) // phone 컬럼
				.title(rs.getString("title")) // title 컬럼
				.description(rs.getString("description")) // description 컬럼
				.build(); // TravelVO 인스턴스 생성
		return travel;
	}

	private void mapList(List<TravelVO> list, PreparedStatement stmt) throws SQLException {
		try (ResultSet rs = stmt.executeQuery()) {
			while (rs.next()) {
				TravelVO travel = map(rs);
				list.add(travel);
			}
		}
	}
}
