//���� : �ڿ��� �й� : 202046004
package test;

public class SamsungTV implements TV{
	public void powerOn() {
		System.out.println("SamsunTV -- ������ �Ҵ�.");
	}
	public void powerOff() {
		System.out.println("SamsunTV -- ������ ����.");
	}
	public void volumeUp() {
		System.out.println("SamsunTV -- �Ҹ��� �ø���.");
	}
	public void volumeDown() {
		System.out.println("SamsunTV -- �Ҹ��� ������..");
	}
}
