package com.rj.demo._2018.interview.design_pattern.singleton;

/**
 * @author Eric.Wu
 * @date 2018年4月24日 下午10:51:44
 * 
 */
public class Singleton3 {

	private static Singleton3 singleton3;

	private Singleton3() {
	}

	public Singleton3 getInstance() {
		
		synchronized(Singleton3.class) {
			if(null == singleton3) {
				singleton3 = new Singleton3();
			}
		}
		
		return singleton3;
	}
}
