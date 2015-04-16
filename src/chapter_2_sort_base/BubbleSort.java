package chapter_2_sort_base;

public class BubbleSort extends Example{
	
	public static void sort(Comparable[] a){
		for(int i = 0; i < a.length - 1; i ++){
			for(int j = 1; j < a.length - i; j ++){
				if(less(a[j], a[j - 1])) exch(a, j, j - 1);
			}
		}
	}
	
	public static void main(String[] args) {
		Integer a[] = {1,22,3,44,5,66,77,8};
		sort(a);
		show(a);
	}
	
	

}
