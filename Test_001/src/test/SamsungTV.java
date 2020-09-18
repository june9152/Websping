//성명 : 박영준 학번 : 202046004
package test;

public class SamsungTV implements TV{
	public void powerOn() {
		System.out.println("SamsunTV -- 전원을 켠다.");
	}
	public void powerOff() {
		System.out.println("SamsunTV -- 전원을 끈다.");
	}
	public void volumeUp() {
		System.out.println("SamsunTV -- 소리를 올린다.");
	}
	public void volumeDown() {
		System.out.println("SamsunTV -- 소리를 내린다..");
	}
}
