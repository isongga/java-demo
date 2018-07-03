package com.rj.demo._2018.interview.sort;

/**
 * @author Eric.Wu
 * @date 2018年4月12日 下午5:22:29
 * 
 *       （1）比较前后相邻的二个数据，如果前面数据大于后面的数据，就将这二个数据交换。
 * 
 *       （2）这样对数组的第0个数据到N-1个数据进行一次遍历后，最大的一个数据就“沉”到数组第N-1个位置。
 * 
 *       （3）N=N-1，如果N不为0就重复前面二步，否则排序完成。
 * 
 *       REFER: https://blog.csdn.net/u010853261/article/details/54891710
 * 
 */
public class BubbleSort {

	public void bubbleSort(int[] a) {
		if (null == a || a.length == 0) {
			return;
		}
		int i, j;
		int len = a.length;

		for (i = 0; i < a.length; i++) {
			for (j = 1; j < len - i; j++) {
				if (a[j - 1] > a[j]) {
					int temp;
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public void bubbleSort2(int [] a){
		
	    int j, k = a.length;
	    boolean flag = true;//发生了交换就为true, 没发生就为false，第一次判断时必须标志位true。
	    while (flag){
	        flag=false;//每次开始排序前，都设置flag为未排序过
	        for(j=1; j<k; j++){
	            if(a[j-1] > a[j]){//前面的数字大于后面的数字就交换
	                //交换a[j-1]和a[j]
	                int temp;
	                temp = a[j-1];
	                a[j-1] = a[j];
	                a[j]=temp;

	                //表示交换过数据;
	                flag = true;
	            }
	        }
	        k--;//减小一次排序的尾边界
	    }//end while
	}
	
	public void bubbleSort3(int [] a, int n){
	    int j , k;
	    int flag = n ;//flag来记录最后交换的位置，也就是排序的尾边界

	    while (flag > 0){//排序未结束标志
	        k = flag; //k 来记录遍历的尾边界
	        flag = 0;

	        for(j=1; j<k; j++){
	            if(a[j-1] > a[j]){//前面的数字大于后面的数字就交换
	                //交换a[j-1]和a[j]
	                int temp;
	                temp = a[j-1];
	                a[j-1] = a[j];
	                a[j]=temp;

	                //表示交换过数据;
	                flag = j;//记录最新的尾边界.
	            }
	        }
	    }
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 0, 9, 3, 12, 7, 8, 3, 4, 65, 22 };
		BubbleSort bs = new BubbleSort();
		bs.bubbleSort2(arr);
		for (int i : arr) {
			System.out.print(i + ",");
		}
	}

}
