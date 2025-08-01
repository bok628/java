
public class C0721_p44 {

	public static void main(String[] args) {
		// 두 개의 변수값 변경하기 (+임시변수 추가)
		int a=20, b=10;
		int test = 0;
		
		test = a;
		a = b;
		b = test;
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);

		
	}

}
