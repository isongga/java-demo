package com.rj.demo._2018.aop;
/**
 * @author Eric.Wu
 * @date 2018年4月15日 下午10:59:42
 * 
 */
public class HelloImpl implements HelloInterface {

	@Override
	public void method1() {
		System.out.println("method1");
	}

	@Override
	public void method2(String str1) {
		System.out.println("method2");

	}

	@Override
	public String method3(String str1) {
		System.out.println("method3");
		return "method3";
	}

}
