package com.rj.demo._2018.aop;
/**
 * @author Eric.Wu
 * @date 2018年4月15日 下午11:37:12
 * 
 */
public class AOPMain {

	public static void main(String[] args) {
		try {
			HelloInterface hello = BeanFactory.getBean("com.rj.demo._2018.aop.HelloImpl", HelloInterface.class);
			//HelloInterface hello = (HelloInterface) BeanFactory.getBean("com.rj.demo._2018.aop.HelloImpl");
			hello.method1();
			hello.method2("test method 2");
//			String str = hello.method3("test metshod 3");
//			System.out.println("===" + str);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
