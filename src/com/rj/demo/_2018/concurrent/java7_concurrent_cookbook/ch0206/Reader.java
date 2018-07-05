package com.rj.demo._2018.concurrent.java7_concurrent_cookbook.ch0206;
/**
 * @author Eric.Wu
 * @date 2018年5月1日 下午11:44:05
 * 
 */
public class Reader implements Runnable {
	
	private PricesInfo pricesInfo;
	
	public Reader (PricesInfo pricesInfo) {
		this.pricesInfo = pricesInfo;
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.printf("%s: price1 : %f\n", Thread.currentThread().getName(), pricesInfo.getPrice1());
			System.out.printf("%s: price2 : %f\n", Thread.currentThread().getName(), pricesInfo.getPrice2());
		}
	}

}
