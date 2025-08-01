public class C0721_13 {

	public static void main(String[] args) {
		int a = 1000000;
		int b = 2000000;
		long c = (long)a * (long)b;
		long d = (long)a * b;
		
		System.out.println("c : "+c);
		System.out.println("d : "+d);
		
		
		int e = 1000000;
		int f = a * e / e; // -727
		int g = a / e * e;
		
		
	}

}

