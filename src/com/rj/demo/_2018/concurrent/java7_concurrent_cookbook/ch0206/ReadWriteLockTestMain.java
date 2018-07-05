package com.rj.demo._2018.concurrent.java7_concurrent_cookbook.ch0206;
/**
 * @author Eric.Wu
 * @date 2018年5月1日 下午11:49:55
 * 
 */
public class ReadWriteLockTestMain {
	
	public static void main(String[] args) {
		PricesInfo pricesInfo = new PricesInfo();
		Reader[] readers = new Reader[5];
		Thread[] threads = new Thread[5];
		for(int i=0; i<threads.length; i++) {
			readers[i] = new Reader(pricesInfo);
			threads[i] = new Thread(readers[i]);
		}
		
		Writer writer = new Writer(pricesInfo);
		Thread writerThread = new Thread(writer);
		
		for(int i=0; i<threads.length; i++) {
			threads[i].start();
		}
		writerThread.start();
		
	}
	
}
