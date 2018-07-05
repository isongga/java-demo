package com.rj.demo._2018.javase;
/**
 * @author Eric.Wu
 * @date 2018年4月25日 上午9:45:17
 * 
 */

public class HelloB extends HelloA {
	public HelloB() {
		System.out.println("HelloB");
	}

	{
		System.out.println("I'm B class");
	}

	static {
		System.out.println("static B");
	}

	public static void main(String[] args) {
		new HelloB();
	}
}
