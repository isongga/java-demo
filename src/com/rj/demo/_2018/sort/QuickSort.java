package com.rj.demo._2018.interview.sort;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Eric.Wu
 * @date 2018年4月12日 下午7:38:19
 * 
 */
public class QuickSort {

	public void quickSort(int[] array, int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		int index = partition(array, lo, hi);
		quickSort(array, lo, index - 1);
		quickSort(array, index + 1, hi);
	}

	public int partition(int[] array, int lo, int hi) {
		// 固定切分方式

		int key = array[lo];
		while (lo < hi) {
			while (array[hi] >= key && hi > lo) {
				hi--;
			}
			array[lo] = array[hi];
			while (array[lo] <= key && hi > lo) {
				lo++;
			}
			array[hi] = array[lo];
		}
		array[hi] = key;
		return hi;
	}

	public void nonRecrutQuickSort(int[] a) {
		// 设置两个栈，一个用于保存
		if (a == null || a.length < 0)
			return;
		Stack<Integer> startStack = new Stack<Integer>();// 保存当前划分的最高位
		Stack<Integer> endStack = new Stack<Integer>();// 保存当前划分的最低位
		int start = 0;
		int end = a.length - 1;

		int pivotPos;

		startStack.push(start);
		endStack.push(end);

		while (!startStack.isEmpty()) {
			start = startStack.pop();
			end = endStack.pop();
			pivotPos = partition(a, start, end);
			if (start < pivotPos - 1) {
				startStack.push(start);
				endStack.push(pivotPos - 1);
			}
			if (end > pivotPos + 1) {
				startStack.push(pivotPos + 1);
				endStack.push(end);
			}
		}
	}

	public static void main(String[] args) {
		int a[] = { 10, 1, 4, 7, 8, 6, 3, 4, 4, 4, 4, 4, 2, 5, 9, 4, 2 };
		QuickSort qs = new QuickSort();
		qs.nonRecrutQuickSort(a);
		System.out.println(Arrays.toString(a));
	}

}
