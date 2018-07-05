package com.rj.demo._2018.interview.concurrent.java7_concurrent_cookbook.ch0204;
/**
 * @author Eric.Wu
 * @date 2018年5月1日 下午10:24:53
 * 
 */
public class Consumer implements Runnable{

private EventStorage storage;
	
	public Consumer(EventStorage storage) {
		this.storage = storage;
	}
	
	@Override
	public void run() {
		for(int i=0; i<100; i++) {
			storage.get();
		}
	}
	
}
