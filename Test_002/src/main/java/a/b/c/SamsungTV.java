package a.b.c;

public class SamsungTV implements TV{
	public SamsungTV() {
		System.out.println("SamsungTV -- 객체생성");
	}
	public void turnOn() {
		System.out.println("SamsungTV -- 전원을켠다.");
	}
}
