package com.rj.demo._2018.concurrent.java7_concurrent_cookbook.ch0205;

import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Eric.Wu
 * @date 2018年5月1日 下午10:41:29
 * 
 */
public class PrintQueue {
	
	private final Lock queueLock = new ReentrantLock();
	
	public void printJob(Object document) {
//		try {
//			queueLock.lock();
//			System.out.println(Thread.currentThread().getName() + " 获取到锁。");
//			Long duration = (long) (Math.random()*10000);
//			System.out.println(Thread.currentThread().getName() 
//				+ ": PrintQueue: printing a job during "
//				+ (duration/1000) + " seconds");
//			Thread.sleep(duration);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		} finally {
//			queueLock.unlock();
//		}
		
		//tryLock
		
		if(queueLock.tryLock()) {
			System.out.println(Thread.currentThread().getName() + " 获取到锁。");
			try {
				Long duration = (long) (Math.random()*10000);
				System.out.println(Thread.currentThread().getName() 
					+ ": PrintQueue: printing a job during "
					+ (duration/1000) + " seconds");
				Thread.sleep(duration);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				queueLock.unlock();
			}
		} else {
			System.out.println(Thread.currentThread().getName() + " 没有获取到锁。");
		}
	}
	
}
