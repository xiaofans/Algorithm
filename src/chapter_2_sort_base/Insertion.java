package chapter_2_sort_base;

public class Insertion extends Example {
	
	public static void sort(Comparable[] a){
		int N = a.length;
		for(int i = 1; i < N;i ++){
			for(int j = i; j > 0 && less(a[j], a[j - 1]);j --){
				exch(a, j, j - 1);
			}
		}
	}
	
	public static void main(String[] args) {
		Integer[] a = {10,2,4,3,1,8,9,0};
		sort(a);
		show(a);
	}

}
