package com.rj.demo._2018.interview.search;
/**
 * @author Eric.Wu
 * @date 2018年4月12日 上午10:02:10
 * 
 * 顺序查找
 * 
 */
public class SeqSearch {

	public int seqSearch(int[] a, int d) {
		if(a == null || a.length == 0) {
			return -1;
		}
		for(int i=0; i< a.length; i++) {
			if(d == a[i]) {
				return i+1;
			}
		}
		return -1;
	}
	
	//test
	public static void main(String[] args) {
		int[] array={32,5,67,6,1,7};
		SeqSearch seqSearch = new SeqSearch();
		int index = seqSearch.seqSearch(array, 6);
		System.out.printf("6 是数组中的第%d个元素。",  index);
	}
}
