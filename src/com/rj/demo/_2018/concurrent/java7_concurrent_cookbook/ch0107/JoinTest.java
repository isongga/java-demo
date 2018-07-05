package com.rj.demo._2018.concurrent.java7_concurrent_cookbook.ch0107;

import java.util.Date;

/**
 * @author Eric.Wu
 * @date 2018年4月30日 上午11:59:22
 * 
 */
public class JoinTest {
	public static void main(String[] args) {
		System.out.printf("Main thread started: %s\n", new Date());
		DataSourcesLoader dsLoader = new DataSourcesLoader();
		Thread t1 = new Thread(dsLoader);
		NetworkConnectionsLoader ncLoader = new NetworkConnectionsLoader();
		Thread t2 = new Thread(ncLoader);
		t1.start();
		t2.start();
		
		//
		try {
			t1.join();//主线程等待t1结束
			t2.join();//主线程等待t2结束
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.printf("Main thread finished: %s\n", new Date());
		
	}
}
