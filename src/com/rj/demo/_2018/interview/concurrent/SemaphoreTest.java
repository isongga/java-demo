package com.rj.demo._2018.interview.concurrent;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 * @author Eric.Wu
 * @date 2018年4月24日 上午9:49:14
 * 
 */
public class SemaphoreTest {

	private final static Semaphore MAX_SEMAPHORE = new Semaphore(5);
	private final static SimpleDateFormat DEFAULT_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public static String getDateTime() {
		Date datetime = Calendar.getInstance().getTime();
		return DEFAULT_DATE_FORMAT.format(datetime);
	}
	
	public static void main(String[] args) {
		for(int i=0; i<20; i++) {
			final int num = i;
			final Random random = new Random();
			new Thread() {
				public void run() {
					boolean acquired = false;
					try {
						MAX_SEMAPHORE.acquire();
						acquired = true;
						System.out.println("我是线程：" + num + "我获得了使用权！" + getDateTime());
						Thread.sleep(1000 + (random.nextInt() & 5000));
						System.out.println("我是线程：" + num + "我执行完了！" + getDateTime());
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						if(acquired) {
							MAX_SEMAPHORE.release();
						}
					}
				}
			}.start();
		}
	}
	
}
