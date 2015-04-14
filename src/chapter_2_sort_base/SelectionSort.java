package chapter_2_sort_base;

public class SelectionSort extends Example{
	public static void sort(Comparable[] a){
		int N = a.length;
		for(int i = 0; i < N;i++){
			int min = i;
			for(int j = i + 1; j < N;j ++){
				if(less(a[j],a[min])) min = j;
			}
			exch(a, i, min);
		}
	}
	
	public static void main(String[] args) {
		Integer [] a = {1,10,2,34,5,2,9,12};
		sort(a);
		show(a);
	}

}
