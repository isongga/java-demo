package com.rj.demo._2018.javase.init_order;
/**
 * @author Eric.Wu
 * @date 2018年4月22日 下午6:52:33
 * 
 */
public class SubClass extends SuperClass {

	static{
        System.out.println("SubClass init");
    }
    
    public static final String HELLOWORD = "hello word";
    
    public SubClass() {
    	System.out.println("subclass 构造方法");
    }
    
    public static void main(String[] args) {
    	//case1: 
    	//case2:
    	System.out.println(SubClass.HELLOWORD);
    	System.out.println(SuperClass.value);
    	//case3:
    }
}
