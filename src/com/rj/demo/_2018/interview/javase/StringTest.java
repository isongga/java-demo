package com.rj.demo._2018.interview.javase;
/**
 * @author Eric.Wu
 * @date 2018年4月13日 下午10:07:10
 * 
 */
public class StringTest {

	public static void main(String[] args) {
//		String a = "a" + "b" + 1;
//		String b = "ab1";
//		System.out.println(a == b);
		//test();
		
		String str1 = "hello";
		String str2 = "he" + new String("llo");
		System.err.println(str1 == str2);
		System.out.println(System.identityHashCode(str1));
		System.out.println(new StringTest().toString()); 
	}
	
	public String toString() {
        return "InfiniteRecursive address: " + super.toString() + "\n";
    }
	
	
	public static void test() {
		int a = 1, b = 1, c = 1, d = 1;
		a++;
		++b;
		c = c++;
		d = ++d;
		
		System.out.println(a + "\t" + b + "\t" + c + "\t" + d + "\t");
	}
}
