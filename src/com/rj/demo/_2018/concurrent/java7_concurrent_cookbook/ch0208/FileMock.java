package com.rj.demo._2018.interview.concurrent.java7_concurrent_cookbook.ch0208;
/**
 * @author Eric.Wu
 * @date 2018年5月3日 下午9:59:56
 * 
 */
public class FileMock {
	
	private String[] content;
	private int index;
	
	public FileMock(int size, int length){
		content = new String[size];
		for(int i=0; i<size; i++) {
			StringBuilder buffer = new StringBuilder(length);
			for(int j=0; j<length; j++) {
				int indice = (int) Math.random()*255;
				buffer.append((char)indice);
			}
			content[i] = buffer.toString();
 		}
		index = 0;
	}
	
	public boolean hasMoreLines() {
		return index < content.length;
	}
	
	public String getLine() {
		if(this.hasMoreLines()) {
			System.out.println("Mock: " + (content.length-index));
			return content[index++];
		}
		return null;
	}
	
}
