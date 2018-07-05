package com.rj.demo._2018.concurrent.java7_concurrent_cookbook.ch0205;
/**
 * @author Eric.Wu
 * @date 2018年5月1日 下午10:51:54
 * 
 */
public class LockTestMain {

	public static void main(String[] args) {
		PrintQueue queue = new PrintQueue();
		Thread[] threads = new Thread[2];
		for(int i=0; i<2; i++) {
			threads[i] = new Thread(new Job(queue), "Thread-"+i);
		}
		for(int i=0; i<2; i++) {
			threads[i].start();
		}
	}
	
}
