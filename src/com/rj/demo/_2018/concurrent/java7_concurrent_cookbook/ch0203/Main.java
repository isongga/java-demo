package com.rj.demo._2018.concurrent.java7_concurrent_cookbook.ch0203;
/**
 * @author Eric.Wu
 * @date 2018年5月1日 下午9:43:35
 * 
 */
public class Main {

	public static void main(String[] args) {
		Cinema cinema = new Cinema();
		TicketOffice1 ticketOffice1 = new TicketOffice1(cinema);
		Thread t1 = new Thread(ticketOffice1, "TicketOffice1");
		TicketOffice2 ticketOffice2 = new TicketOffice2(cinema);
		Thread t2 = new Thread(ticketOffice2, "TicketOffice2");
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.printf("Room 1 Vacancies: %d\n", cinema.getVacanciesCinema1());
		System.out.printf("Room 2 Vacancies: %d\n", cinema.getVacanciesCinema2());
		
		
	}
}
