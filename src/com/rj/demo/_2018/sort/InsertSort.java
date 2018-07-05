package com.rj.demo._2018.sort;

import java.util.Arrays;

/**
 * @author Eric.Wu
 * @date 2018年4月12日 下午6:09:08
 * 
 */
public class InsertSort {

	public void insertSort(int[] arr) {
		int i, j, insertNode;
		int len = arr.length;
		for (i = 1; i < len; i++) {
			insertNode = arr[i];
			j = i - 1;
			while (j >= 0 && insertNode < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = insertNode;
		}
	}

	public static void main(String[] args) {
		int a[] = { 38, 65, 97, 76, 13, 27, 49 };
		InsertSort is = new InsertSort();
		is.insertSort(a);
		System.out.println(Arrays.toString(a));
	}
}
