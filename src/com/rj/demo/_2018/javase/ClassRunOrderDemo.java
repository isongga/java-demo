package com.rj.demo._2018.javase;
/**
 * @author Eric.Wu
 * @date 2018年4月18日 下午5:20:07
 * 
 */
public class ClassRunOrderDemo {

	private int var1;
	
	{
		System.out.println("执行普通代码块");
		var1 = 1;
		System.out.println("普通代码块结束");
	}
	
	static {
		System.out.println("执行静态代码块");
	}
	
	
	public ClassRunOrderDemo() {
		var1 = 2;
		System.out.println("构造方法执行");
	}
	
	
	
	
	public static void main(String[] args) {
		ClassRunOrderDemo c1 = new ClassRunOrderDemo();
		ClassRunOrderDemo c2 = new ClassRunOrderDemo();
		System.out.println(c1.var1);
	}
}
