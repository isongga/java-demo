package com.rj.demo._2018.concurrent.java7_concurrent_cookbook.ch0108;

import java.util.Date;
import java.util.Deque;
import java.util.concurrent.TimeUnit;

/**
 * @author Eric.Wu
 * @date 2018年4月30日 下午2:13:40
 * 
 */
public class WriterTask implements Runnable {
	
	private Deque<Event> deque;
	
	public WriterTask (Deque<Event> deque) {
		this.deque = deque;
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			Event e = new Event();
			e.setDate(new Date());
			e.setEvent(String.format("The thread %s has generated an event", Thread.currentThread().getId()));
			deque.addFirst(e);
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}
	
}
