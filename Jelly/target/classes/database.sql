-- 1. 페이지 단위로 10개씩 보여주기
-- 정렬기준 : REGION, TITLE

-- 전체 데이터 건수
SELECT COUNT(*) TOTAL_COUNT FROM TRAVEL;

-- 한 페이지당 10개 목록으로 운영
-- 예] 2페이지의 목록 얻기 11 ~ 20
-- 정렬: REGION, TITLE

SELECT *
FROM(
	SELECT ROW_NUMBER() OVER(ORDER BY REGION, TITLE) SEQ, T.*	
	FROM TRAVEL T
);



CREATE OR REPLACE VIEW TRAVEL_VIEW
AS
	SELECT *
	FROM(
		SELECT ROW_NUMBER() OVER(ORDER BY REGION, TITLE) SEQ, T.*	
		FROM TRAVEL T
	);


SELECT * FROM TRAVEL_VIEW
WHERE SEQ BETWEEN 11 AND 20;



-- 2. 지역별로 보여주기
-- 지역 목록을 제시하고 선택후 해당 지역 목록 출력 

SELECT REGION, COUNT(*) COUNT
FROM TRAVEL
GROUP BY REGION
ORDER BY COUNT ASC;


SELECT * FROM TRAVEL t 
WHERE REGION = '수도권'
ORDER BY TITLE;


-- 3. 검색
-- 검색 대상 컬럼: TITLE, DESCRIPTION
SELECT * FROM TRAVEL t 
WHERE TITLE LIKE '%해수욕장%' OR DESCRIPTION LIKE '%해수욕장%'
ORDER BY REGION, TITLE;





-- 4. 상세보기 
SELECT * FROM TRAVEL WHERE NO = 10;