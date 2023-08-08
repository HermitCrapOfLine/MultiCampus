package java_study.chapter07.sec08;

public class DmbCellPhoneExcample {

	public static void main(String[] args) {

		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);

		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("모델: " + dmbCellPhone.color);

		System.out.println("채널: " + dmbCellPhone.channel);

		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoid("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요 저 옆집에 사는 철수 친구 영희인데요");
		dmbCellPhone.sendVoid("어, 그래 철수 지금 집에 없는데?");
		dmbCellPhone.hangUp(); // 뚜.. 뚜.. 뚜..

		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
