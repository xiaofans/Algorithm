package equals;

public class DDAndEquals {
	
	
	public static void main(String[] args) {
		String a = "aa";
		String b = "aa";
		//System.out.println(a == b);
		//System.out.println(a.equals(b));
		
		A a1 = new A();
		A a2 = new A();
		A a3 = a1;
		//System.out.println(a1 == a2);
		//System.out.println(a1 == a3);
		
		
		
		////////////////////////////////////////////
		Integer in1 = new Integer(1);
		Integer in2 = new Integer(1);
		//System.out.print("=="+ (in1 == in2) + ":" + in1.equals(in2));
	
		Integer i = new Integer(1);
		int i1 = 1;
		System.out.println(i == i1);
		
		String sb = "込込込";
		String sa = "込込込";
		
		System.out.println(sa == sb);
	}

}
