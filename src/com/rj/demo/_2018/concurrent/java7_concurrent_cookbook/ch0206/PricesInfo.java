package com.rj.demo._2018.concurrent.java7_concurrent_cookbook.ch0206;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author Eric.Wu
 * @date 2018年5月1日 下午11:39:27
 * 
 */
public class PricesInfo {
	
	private double price1;
	private double price2;
	
	private ReadWriteLock lock;
	
	public PricesInfo() {
		price1 = 1.0;
		price2 = 2.0;
		lock = new ReentrantReadWriteLock();
	}
	
	public double getPrice1() {
		lock.readLock().lock();
		double value = price1;
		lock.readLock().unlock();
		return value;
	}
	
	public double getPrice2() {
		lock.readLock().lock();
		double value = price2;
		lock.readLock().unlock();
		return value;
	}
	
	public void setPrices(double price1, double price2) {
		lock.writeLock().lock();
		this.price1 = price1;
		this.price2 = price2;
		lock.writeLock().unlock();
	}
	
}
