package com.jm2008.learn.annotation.custom.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestProcessor {

	public static void main(String[] args) {
		try {
			Class<MyTest> myTestClass = (Class<MyTest>) Class.forName("com.jm2008.learn.annotation.custom.test.MyTest");
			Method[] methods = myTestClass.getMethods();
			for (int i = 0; i < 4; i++) {
				Method method = methods[i];
				System.out.println("Inspecting into: " + method.getName());
				if (method.isAnnotationPresent(Test.class)) {
					System.out.println("Annotation is present.");
					Test test = (Test) method.getAnnotation(Test.class);
					if (test.enabled()) {
						System.out.println("Annotation is enabled.");
						method.invoke(myTestClass.newInstance());
					} else {
						System.out.println("Annotation is not enabled.");
					}
				} else {
					System.out.println("Annotation is not present.");
				}
			}
		} catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | InstantiationException e) {
			e.printStackTrace();
		}
	}

}
