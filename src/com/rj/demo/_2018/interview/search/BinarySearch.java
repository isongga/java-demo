package com.rj.demo._2018.interview.search;
/**
 * @author Eric.Wu
 * @date 2018年4月12日 上午10:23:52
 * 
 * 二分查找或者折半查找
 * 排序本身是一种很费时的运算，所以二分法比较适用于顺序存储结构。
 * 
 */
public class BinarySearch {
	
	//找到目标元素所在的位置
	public int binarySearch(int[] arr, int target) {
		if(arr == null || arr.length == 0) {
			return -1;
		}
		int low = 0, high = arr.length - 1;
		while(low <= high) {
			int mid = (low + high) / 2;
			int midValue = arr[mid];
			if(target == midValue) {
				return mid;
			}else if(target > midValue) {
				low = mid + 1;
			}else if(target < midValue) {
				high = mid - 1;
			}
		}
		return -1;
	}
	
	public int recursiveBinarySearch(int[] arr, int low, int high, int target) {
		if(arr == null || arr.length == 0) {
			return -1;
		}		
		if(low < high) {
			int mid = (low + high) / 2;
			int midValue = arr[mid];
			if(target == midValue) {
				return mid;
			}else if(target > midValue) {
				return recursiveBinarySearch(arr, mid+1, high, target);
			}else if(target < midValue) {
				return recursiveBinarySearch(arr, low, mid-1, target);
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 5, 8, 9, 10, 13, 15, 20, 78};
		BinarySearch bs = new BinarySearch();
		int target = 15;
		int index = bs.binarySearch(arr, target);
		System.out.printf(" %d 是数组中的第%d个元素。", target, index);
		index = bs.recursiveBinarySearch(arr, 0, arr.length-1, target);
		System.out.printf(" %d 是数组中的第%d个元素。", target, index);
		
	}
}
