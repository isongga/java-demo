package com.rj.demo._2018.interview.javase;

/**
 * @author Eric.Wu
 * @date 2018年4月25日 上午9:44:50
 * 
 */
class HelloA {
	public HelloA() {
		System.out.println("HelloA");
	}

	{
		System.out.println("I'm A class");
	}

	static {
		System.out.println("static A");
	}
}