package com.rj.demo._2018.javase.init_order;
/**
 * @author Eric.Wu
 * @date 2018年4月22日 下午6:51:52
 * 
 */
public class SuperClass {

	static{
        System.out.println("SuperClass init");
    }
    
    public static int value = 123;
    
    public SuperClass() {
    	System.out.println("superclass 构造方法");
    }
}
