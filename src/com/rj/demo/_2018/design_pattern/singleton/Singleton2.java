package com.rj.demo._2018.design_pattern.singleton;

/**
 * @author Eric.Wu
 * @date 2018年4月24日 下午10:51:44
 * 
 */
public class Singleton2 {

	private static Singleton2 singleton2;

	private Singleton2() {
	}

	public Singleton2 getInstance() {
		if(null == singleton2) {
			singleton2 = new Singleton2();
		}
		return singleton2;
	}
}
