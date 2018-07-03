package com.rj.demo._2018.interview.concurrent.java7_concurrent_cookbook.ch0110;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author Eric.Wu
 * @date 2018年4月30日 下午8:03:08
 * 
 */
public class SafeTask implements Runnable {
	
	private static ThreadLocal<Date> startDate = new ThreadLocal<Date>() {
		protected Date initialValue() {
			return new Date();
		}
	};

	@Override
	public void run() {
		System.out.printf("Starting Thread : %s : %s\n", Thread.currentThread().getId(), startDate.get());
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Thread Finished: %s : %s\n", Thread.currentThread().getId(), startDate.get());
	}

}
