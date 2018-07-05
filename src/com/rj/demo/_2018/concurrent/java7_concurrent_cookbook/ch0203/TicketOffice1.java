package com.rj.demo._2018.concurrent.java7_concurrent_cookbook.ch0203;
/**
 * @author Eric.Wu
 * @date 2018年5月1日 下午9:38:00
 * 
 */
public class TicketOffice1 implements Runnable {

	private Cinema cinema;
	
	public TicketOffice1 (Cinema cinema) {
		this.cinema = cinema;
	}
	
	@Override
	public void run() {
		cinema.sellTickets1(3);
		cinema.sellTickets1(2);
		cinema.sellTickets2(2);
		cinema.returnTickets1(3);
		cinema.sellTickets1(5);
		cinema.sellTickets2(2);
		cinema.sellTickets2(2);
		cinema.sellTickets2(2);
	}

}
