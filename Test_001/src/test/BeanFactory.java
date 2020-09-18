//성명 : 박영준 학번 : 202046004
package test;

public class BeanFactory {
	public Object getBean(String beanName)
	{
		if(beanName.contentEquals("samsung")) {
			return new SamsungTV();
		}else if(beanName.contentEquals("lg")) {
			return new LgTV();
		}
		return null;
	}

}
