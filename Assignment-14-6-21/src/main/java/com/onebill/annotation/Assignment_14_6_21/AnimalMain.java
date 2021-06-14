package com.onebill.annotation.Assignment_14_6_21;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.onebill.annotation.bean.AnimalType;
import com.onebill.annotation.config.Config;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		AnimalType anitype = context.getBean(AnimalType.class);
		anitype.getAnimal().eat();
		anitype.getAnimal().speak();
	}

}
