package com.rj.demo._2018.concurrent.java7_concurrent_cookbook.ch0204;
/**
 * @author Eric.Wu
 * @date 2018年5月1日 下午10:26:22
 * 
 */
public class Main {

	public static void main(String[] args) {
		EventStorage storage = new EventStorage();
		Producer producer = new Producer(storage);
		Consumer consumer = new Consumer(storage);
		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);
		producerThread.start();
		consumerThread.start();
	}
	
}
