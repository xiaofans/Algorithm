package chapter_2_sort_base;

public class Shell extends Example{
	
	public static void sort(Comparable[] a){
		int N = a.length;
		int h = 1;
		while(h < N / 3) h = 3 * h + 1;
		while(h >= 1){
			for(int i = h;i < N; i ++){
				for(int j = i; j >= h && less(a[j],a[j - h]);j -= h){
					exch(a, j, j - h);
				}
			}
			h = h / 3;
		}
	}

	
	public static void main(String[] args) {
		//Integer a[] = {10,0,4,5,78,3,45,67,67,34,65,776,434,54,3,445,6,7,5464,112};
		Integer a[] = {10,2};
		sort(a);
		show(a);
	}
}


 
