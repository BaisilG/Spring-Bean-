package org.baisil;

import org.baisil.cars.Innova;
import org.baisil.cars.Landrover;
import org.baisil.interfaces.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car innova = new Innova();
		Car landrover = new Landrover();
		//innova.specs();
		//landrover.specs();
		
		System.out.println(innova.specs());
		System.out.println(landrover.specs());
		
		// creating another car object 
		
		//Car myCar = new Innova();
		//System.out.println(myCar.specs());
		
		
		// we can not create object on the fly so we can use the advantage of context 
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		// this particular class is not available to us so we are going to create a AppConfig
		
		// now we can comment the above code that 
		//Car myCar = new Innova();
		//System.out.println(myCar.specs());
		
		Car myCar = context.getBean("innova", Car.class);
		myCar.specs();
		context.close(); // we need to close the context
		
		
		
	}

}
