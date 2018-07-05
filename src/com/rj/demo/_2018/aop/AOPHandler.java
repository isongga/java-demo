package com.rj.demo._2018.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Eric.Wu
 * @date 2018年4月15日 下午11:01:07
 * 
 */
public class AOPHandler implements InvocationHandler{
	
	private Object target;
	public AOPHandler(Object target) {
		this.target = target;
	}
	
	public void println(String str, Object...args) {
		System.out.println(str);
		if(args == null) {
			System.out.println("\t input nothing.");
		} else {
			for(Object obj : args) {
				System.out.println(obj);
			}
		}
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("invoke method : " + method.getName());
		Class<?>[] variables = method.getParameterTypes();
		System.out.println("\n\t参数类型列表：\n");
		for(Class<?> typeVariables : variables) {
			System.out.println("\t\t\t" + typeVariables.getName());
		}
		println("\n\n\t传入参数值为：\n");
		if(null != args) {
			for(Object arg : args) {
				System.out.println("\t\t\t" + arg);
			}
		}
		Object result = method.invoke(target, args);
		println("方法来源： " + method.getDeclaringClass());
		println("返回的参数为：" + result);
		println("返回值类型为：" + method.getReturnType());
		return result;
	}

}
