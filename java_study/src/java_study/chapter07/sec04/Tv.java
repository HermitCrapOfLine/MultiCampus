package java_study.chapter07.sec04;

public class Tv {
	private int channel;
	private int volume;
	private boolean onOff;
	private int serial;
	static int count = 0; // �ʱⰪ�� �ִ� ���� �����̴�.

	public int getSerial() {
		return serial;
	}

	public void setSerial(int serial) {
		this.serial = serial;
	}

	public Tv() {
		super();
		count++;
		serial = count;
	}

	public Tv(int channer, int volume, boolean onOff) {
		super();
		count++;
		serial = count;
		this.channel = channer;
		this.volume = volume;
		this.onOff = onOff;
	}

	public int getChanner() {
		return channel;
	}

	public void setChanner(int channer) {
		this.channel = channer;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isOnOff() {
		return onOff;
	}

	public void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}

	@Override
	public String toString() {
		return "Tv [channer=" + channel + ", volume=" + volume + ", onOff=" + onOff + "]";
	}

}
