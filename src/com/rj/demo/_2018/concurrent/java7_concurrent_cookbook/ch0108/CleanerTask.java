package com.rj.demo._2018.concurrent.java7_concurrent_cookbook.ch0108;

import java.util.Date;
import java.util.Deque;

/**
 * @author Eric.Wu
 * @date 2018年4月30日 下午2:26:11
 * 
 */
public class CleanerTask extends Thread {
	
	private Deque<Event> deque;
	
	public CleanerTask(Deque<Event> deque) {
		this.deque = deque;
		setDaemon(true);
	}
	
	
	@Override
	public void run() {
		while(true) {
			Date date = new Date();
			clean(date);
		}
	}
	
	private void clean(Date date) {
		//System.out.printf("before clean: size of the deque: %d\n", deque.size());
		//System.out.println("====");
		if(deque.size() == 0) 
			return;
		long difference;
		boolean delete = false;
		do {
			Event e= deque.getLast();
			difference = date.getTime() - e.getDate().getTime();
			System.out.println(difference);
			if(difference > 10000) {
				System.out.printf("Cleaner: %s\n", e.getDate());
				deque.removeLast();
				delete = true;
			}
		} while(difference > 10000);
		if(delete) {
			System.out.printf("after clean: size of the deque: %d\n", deque.size());
		}
	}

}
