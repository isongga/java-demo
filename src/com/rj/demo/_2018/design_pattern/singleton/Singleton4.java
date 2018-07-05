package com.rj.demo._2018.interview.design_pattern.singleton;

/**
 * @author Eric.Wu
 * @date 2018年4月24日 下午10:51:44
 * 
 */
public class Singleton4 {

	private static Singleton4 singleton4;

	private Singleton4() {
	}

	public Singleton4 getInstance() {
		if(null == singleton4) {
			synchronized(Singleton4.class) {
				if(null == singleton4) {
					singleton4 = new Singleton4();
				}
			}
		}
		
		return singleton4;
	}
}
