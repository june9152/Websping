// 성명 : 박영준 학번 : 202046004

package test;

public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean(args[0]);
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
//		SamsungTV s_tv = new SamsungTV();
//		s_tv.powerOn();
//		s_tv.volumeUp();
//		s_tv.volumeDown();
//		s_tv.powerOff();
//
//	
//		LgTV L_tv = new LgTV();
//		L_tv.powerOn();
//		L_tv.volumeDown();
//		L_tv.volumeUp();
//		L_tv.powerOff();	
	
	}

}
