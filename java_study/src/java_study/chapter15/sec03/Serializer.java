package java_study.chapter15.sec03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializer {
	// deserialize ������ȭ

	public static Object load(String filePath) throws Exception {
		// ���� ó���� ȣ���� �ʿ��� ó��
		// �ݱ�(close)�� �ڵ�ȭ
		try (FileInputStream fis = new FileInputStream(filePath); ObjectInputStream ois = new ObjectInputStream(fis);) {
			return ois.readObject(); // �ν��Ͻ� ����
		} // catch�� �� ���� ���, throws Exception���� ����. try�� ��� ������ �ڵ� close()�� ��.
	}

	// serialize ����ȭ
	public static void save(String filePath, Object obj) throws Exception {
		try (FileOutputStream fos = new FileOutputStream(filePath);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(obj);
			oos.flush();
		}
	}
}
