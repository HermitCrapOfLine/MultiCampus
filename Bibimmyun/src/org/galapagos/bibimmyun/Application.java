package org.galapagos.bibimmyun;

import org.galapagos.common.cli.Input;

public class Application {

	public static void main(String[] args) {

		while (true) {
			System.out.println("1]��� 2]�˻� 3]����");
			int sel = Input.readInt("���� > ");
			if (sel == 1) {
				// ���� ��� ���� ���� ����
				System.out.println("��� ����");
			} else if (sel == 2) {
				System.out.println("�˻� ����");
			} else if (sel == 3) {
				System.exit(0);
			} else {
				System.out.println("�߸��� �����Դϴ�.");
			}
		}

	}

}
