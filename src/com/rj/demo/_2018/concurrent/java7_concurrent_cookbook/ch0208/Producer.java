package com.rj.demo._2018.concurrent.java7_concurrent_cookbook.ch0208;
/**
 * @author Eric.Wu
 * @date 2018年5月3日 下午10:47:03
 * 
 */
public class Producer implements Runnable{
	
	private FileMock mock;
	private Buffer buffer;
	
	public Producer(FileMock mock, Buffer buffer) {
		this.mock = mock;
		this.buffer = buffer;
	}

	@Override
	public void run() {
		buffer.setPendingLines(true);
		while (mock.hasMoreLines()) {
			String line = mock.getLine();
			buffer.insert(line);
		}
		buffer.setPendingLines(false);
	}

}
