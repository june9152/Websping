package a.b.c;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVuser {

	public static void main(String[] args) {
		AbstractApplicationContext container
		= new GenericXmlApplicationContext("applicationConetext.xml");
		TV tv = (TV)container.getBean("tv");
		tv.turnOn();
	}

}
