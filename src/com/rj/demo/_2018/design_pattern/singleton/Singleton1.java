package com.rj.demo._2018.interview.design_pattern.singleton;
/**
 * @author Eric.Wu
 * @date 2018年4月24日 下午10:43:54
 * 
 */
public class Singleton1 {
	private static Singleton1 singleton1 = new Singleton1();
	
	private Singleton1() {
	}
	
	public Singleton1 getInstance() {
		return singleton1;
	}
}
