package com.onebill.annotation.Assignment_14_6_21;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.onebill.annotation.bean.PostConstructPreDestroy;
import com.onebill.annotation.config.Config;

public class PostInitPreDestroy {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		PostConstructPreDestroy obj1 = context.getBean(PostConstructPreDestroy.class);
		obj1.disp();
	}

}
