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
		Engine engine = (Engine)container.getBean("engine");
		car.시동(engine);
		car.운행(engine);
		car.정지();
	}

}
