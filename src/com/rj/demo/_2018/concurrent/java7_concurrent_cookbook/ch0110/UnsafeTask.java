package com.rj.demo._2018.concurrent.java7_concurrent_cookbook.ch0110;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author Eric.Wu
 * @date 2018年4月30日 下午7:44:07
 * 
 */
public class UnsafeTask  implements Runnable {

	private Date startDate;
	
	@Override
	public void run() {
		startDate = new Date();
		System.out.printf("Starting Thread : %s : %s\n", Thread.currentThread().getId(), startDate);
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Thread Finished: %s : %s\n", Thread.currentThread().getId(), startDate);
	}
	
}
