package com.rj.demo._2018.search;
/**
 * @author Eric.Wu
 * @date 2018年4月12日 下午12:23:30
 * 
 * 分块查找：分块查找又称索引顺序查找，它是顺序查找的一种改进方法。
 * 方法描述：将n个数据元素“按块有序”划分为m块（m<=n）。
 *         每一块中的数据元素不必有序，但块与块之间必须“按块有序”，即第1快中的任一元素的关键字都必须小于第2块中任一元素的关键字；
 *         而第2块中任一元素又都小于第3块中的任一元素，……
 *         a. 首先将查找表分成若干块，在每一块中数据元素的存放是任意的，但块与块之间必须是有序的（假设这种排序是按关键字值递增的，也就是说在第一块中任意一个数据元素的关键字都小于第二块中所有数据元素的关键字，第二块中任意一个数据元素的关键字都小于第三块中所有数据元素的关键字，依次类推）； 
 *         b. 建立一个索引表，把每块中最大的关键字值按块的顺序存放在一个辅助数组中，这个索引表也按升序排列； 
 *         c. 查找时先用给定的关键字值在索引表中查找，确定满足条件的数据元素存放在哪个块中，查找方法既可以是折半方法，也可以是顺序查找。 
 *         d. 再到相应的块中顺序查找，便可以得到查找的结果。 
 * 
 * step1 先选取各块中的最大关键字构成一个索引表；

 * step2 查找分两个部分：先对索引表进行二分查找或顺序查找，以确定待查记录在哪一块中；然后，在已确定的块中用顺序法进行查找。
 */
public class BlockSearch {
	
	private int[] index;
	

//	public int blockSearch(int[] arr, int[] index, int target, int partnum) {
//		int[] index
//		int index = binarySearch 
//		return -1;
//	}
//	
//	public int[] getIndex(int[] arr, int partnum) {
//		int[] index = new int[partnum];
//		
//	}
	
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
	
}
