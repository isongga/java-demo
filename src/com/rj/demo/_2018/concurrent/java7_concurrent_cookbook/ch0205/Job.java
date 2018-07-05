package com.rj.demo._2018.interview.concurrent.java7_concurrent_cookbook.ch0205;
/**
 * @author Eric.Wu
 * @date 2018年5月1日 下午10:49:06
 * 
 */
public class Job implements Runnable {
	
	private PrintQueue printQueue;
	
	public Job(PrintQueue printQueue) {
		this.printQueue = printQueue;
	}

	@Override
	public void run() {
		System.out.printf("%s: going to print a document \n", Thread.currentThread().getName());
		printQueue.printJob(new Object());
		System.out.printf("%s: the document has been printed \n", Thread.currentThread().getName());
		
	}

}
