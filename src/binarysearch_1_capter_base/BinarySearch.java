package binarysearch_1_capter_base;

// 二分查找
/**
 * @author zhaoyu
 *二分查找又称折半查找，它是一种效率较高的查找方法。
 *1.必须采用顺序存储结构 2.必须按关键字大小有序排列。 
 */
public class BinarySearch {
	public static int rank(int key,int[] a){
		int lo = 0;
		int hi = a.length - 1;
		while(lo <= hi){
			int mid = lo + (hi - lo) / 2;
			if(key < a[mid]) hi = mid - 1;
			else if(key > a[mid]) lo = mid + 1;
			else  return mid;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[]  = {1,55,99,102,364,888,4699,5877};
	    System.out.println(rank(4699, arr));
	    System.out.println(Math.abs(-2147483648));
	    System.out.println(1.0/0.0);
	    
	}
}
