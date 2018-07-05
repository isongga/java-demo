package com.rj.demo._2018.concurrent.java7_concurrent_cookbook.ch0107;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author Eric.Wu
 * @date 2018年4月30日 上午11:55:31
 * 
 */
public class NetworkConnectionsLoader implements Runnable{

	@Override
	public void run() {
		System.out.printf("Beginning network connection loading: %s\n", new Date());
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Network connection loading has finished: %s\n", new Date());
	}
	
}
