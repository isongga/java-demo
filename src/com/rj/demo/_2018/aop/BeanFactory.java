package com.rj.demo._2018.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Eric.Wu
 * @date 2018年4月15日 下午11:31:22
 * 
 */
public class BeanFactory {

	public static Object getBean(String className) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Object obj = Class.forName(className).newInstance();
		InvocationHandler handler = new AOPHandler(obj);
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), handler);
	}
	
	@SuppressWarnings("unchecked")
	public static<T> T getBean(String className, Class<T> clazz) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		return (T)getBean(className);
	}
}
