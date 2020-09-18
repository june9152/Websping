package vehicle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CarUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext container
		= new GenericXmlApplicationContext("applicationConetext.xml");
		Car car = (Car)container.getBean("car");
		car.시동();
		car.운행();
		car.정지();
	}

}
