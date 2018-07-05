package com.rj.demo._2018.interview.concurrent.java7_concurrent_cookbook.ch0206;
/**
 * @author Eric.Wu
 * @date 2018年5月1日 下午11:44:05
 * 
 */
public class Writer implements Runnable {
	
	private PricesInfo pricesInfo;
	
	public Writer (PricesInfo pricesInfo) {
		this.pricesInfo = pricesInfo;
	}

	@Override
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println("Writer: Attempt to modify the prices. \n");
			pricesInfo.setPrices(Math.random()*10, Math.random()*8);
			System.out.println("Writer: Prices have been modified. \n");
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
