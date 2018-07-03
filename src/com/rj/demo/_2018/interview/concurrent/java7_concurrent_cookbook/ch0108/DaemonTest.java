package com.rj.demo._2018.interview.concurrent.java7_concurrent_cookbook.ch0108;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Eric.Wu
 * @date 2018年4月30日 下午2:35:34
 * 
 */
public class DaemonTest {
	public static void main(String[] args) {
		Deque<Event> deque = new ArrayDeque<Event>();
		WriterTask writer = new WriterTask(deque);
		for(int i=0; i<3; i++) {
			Thread thread = new Thread(writer);
			thread.start();
		}
		CleanerTask cleaner = new CleanerTask(deque);
		cleaner.start();
		System.out.println(cleaner.isDaemon());
	}
}
