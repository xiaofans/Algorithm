package binarysearch_1_capter_base;

// ���ֲ���
/**
 * @author zhaoyu
 *���ֲ����ֳ��۰���ң�����һ��Ч�ʽϸߵĲ��ҷ�����
 *1.�������˳��洢�ṹ 2.���밴�ؼ��ִ�С�������С� 
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
