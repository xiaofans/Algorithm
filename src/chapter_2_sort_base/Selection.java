package chapter_2_sort_base;

public class Selection {
	public static void sort(Comparable[] a){
		for(int i = 0; i < a.length; i++){
			int min = i;
			for(int j = i + 1; j < a.length;j++){
				if(less(a, j, min)) min = j;
			}
			exch(a, min, i);
		}
	}
	public static boolean less(Comparable[] a,int i,int j){
		return a[i].compareTo(a[j]) < 0;
	}
	
	public static void exch(Comparable[] a,int i,int j){
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void show(Comparable[] a){
		for(int i = 0; i < a.length;i ++){
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		Integer[] a = {10,2,5,16,4,6};
		sort(a);
		show(a);
	}
}
