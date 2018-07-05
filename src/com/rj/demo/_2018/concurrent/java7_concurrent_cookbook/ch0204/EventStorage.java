package com.rj.demo._2018.interview.concurrent.java7_concurrent_cookbook.ch0204;

import java.util.Date;
import java.util.LinkedList;

/**
 * @author Eric.Wu
 * @date 2018年5月1日 下午10:13:47
 * 
 */
public class EventStorage {
	
	private int maxSize;
	private LinkedList<Date> storage;
	
	public EventStorage() {
		maxSize = 10;
		storage = new LinkedList<Date>();
	}
	
	public synchronized void set() {
		while (storage.size() == maxSize) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		storage.add(new Date());
		System.out.printf("Set: %d \n", storage.size());
		notifyAll();
	}
	
	public synchronized void get() {
		while (storage.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("Get: %d: %s \n", storage.size(), storage.poll());
		notifyAll();
	}

}
