package com.rj.demo._2018.interview.concurrent.java7_concurrent_cookbook.ch0107;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author Eric.Wu
 * @date 2018年4月30日 上午11:49:18
 * 
 */
public class DataSourcesLoader implements Runnable {

	@Override
	public void run() {
		System.out.printf("Beginning data sources loading: %s\n", new Date());
		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Data sources loading has finished: %s\n", new Date());
	}
	
}
