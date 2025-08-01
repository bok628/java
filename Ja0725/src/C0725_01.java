
public class C0725_01 {

	public static void main(String[] args) {
		// boolean
		
		boolean a = true;
		boolean a_2 = false;
		
		char b = 42;
		
		char b_7 = 52;
		int b_8 = b_7 - 48;
		
		int b_9 = '4' - '0';
		System.out.println(b_9);
		System.out.println(b_8);
		
		// byte,short,int,long
		byte c = (byte)128;
		System.out.println(c);
		
		
		int d = 2147483647;
		System.out.println(d);
		
		int e = (int)2147483648L;
		System.out.println(e);
		
		int d_4 = 1000000 * 1000000 / 1000000;
		int d_5 = 1000000 / 1000000 * 1000000;
		
		long f = 1L;
		long f2 = 2L;
		
		float g = 1f;
		
		// 변수가 소수점 8자리 이상일 때 출력시 무조건 8자리(. 포함)로 출력
		float g2 = 1.123456789F;
		System.out.println(g2);
		
		// double 접미사 생략 가능
		double h = 1.0d;
		double g_2 = 1.0;
		
		
		
		System.out.println(g_2);
		
		System.out.println(b);
		
		if (3>2) {
			System.out.println(a);
		}else {
			System.out.println(a_2);
		}

	}

}
