package com.rj.demo._2018.concurrent.java7_concurrent_cookbook.ch0203;
/**
 * @author Eric.Wu
 * @date 2018年5月1日 下午5:27:05
 * 
 */
public class Cinema {

	private long vacanciesCinema1;
	private long vacanciesCinema2;
	
	//锁分离。允许同时允许运行两个线程。一个修改vacanciesCinema1，另一个修改vacanciesCinema2属性。
	//如果不设置这两把锁，只用synchronized，那么只能锁Cinema对象。
	//另外这两把锁是final的
	private final Object controlCinema1;
	private final Object controlCinema2;
	
	public Cinema() {
		controlCinema1 = new Object();
		controlCinema2 = new Object();
		vacanciesCinema1 = 20;
		vacanciesCinema2 = 20;
	}
	
	public boolean sellTickets1(int number) {
		synchronized (controlCinema1) {
			if(number < vacanciesCinema1) {
				vacanciesCinema1 -= number;
				return true;
			} else {
				return false;
			}
		}
	}
	public boolean sellTickets2(int number) {
		synchronized (controlCinema2) {
			if(number < vacanciesCinema2) {
				vacanciesCinema2 -= number;
				return true;
			} else {
				return false;
			}
		}
	}
	public boolean returnTickets1(int number) {
		synchronized (controlCinema1) {
			if(number < vacanciesCinema1) {
				vacanciesCinema1 += number;
				return true;
			} 
		}
		return false;
	}
	public boolean returnTickets2(int number) {
		synchronized (controlCinema2) {
			if(number < vacanciesCinema2) {
				vacanciesCinema2 += number;
				return true;
			} 
		}
		return false;
	}
	
	public long getVacanciesCinema1() {
		return vacanciesCinema1;
	}

	public void setVacanciesCinema1(long vacanciesCinema1) {
		this.vacanciesCinema1 = vacanciesCinema1;
	}

	public long getVacanciesCinema2() {
		return vacanciesCinema2;
	}

	public void setVacanciesCinema2(long vacanciesCinema2) {
		this.vacanciesCinema2 = vacanciesCinema2;
	}

	public Object getControlCinema1() {
		return controlCinema1;
	}

	public Object getControlCinema2() {
		return controlCinema2;
	}
	
}
