package java_study.chapter07.sec08;

public class DmbCellPhoneExcample {

	public static void main(String[] args) {

		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);

		System.out.println("��: " + dmbCellPhone.model);
		System.out.println("��: " + dmbCellPhone.color);

		System.out.println("ä��: " + dmbCellPhone.channel);

		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoid("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ��� �� ������ ��� ö�� ģ�� �����ε���");
		dmbCellPhone.sendVoid("��, �׷� ö�� ���� ���� ���µ�?");
		dmbCellPhone.hangUp(); // ��.. ��.. ��..

		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
