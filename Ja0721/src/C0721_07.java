
public class C0721_07 {

	public static void main(String[] args) {
		// int a = 7000000;
		int result = 7000000 * 7000000 / 7000000; // 곱한 값이 21억이 넘어서 -183 출력 => 나누기 먼저 계산
		System.out.println("result : "+result);
		
		int result2 = 7000000 / 7000000 * 7000000; //7000000
		System.out.println("result2 : "+result2);
		
		int n = 65;
		System.out.println("n : "+n);
		char ch = (char) n;
		System.out.println("ch : "+ch);
		
		float f = 1.6F;
		System.out.println("f : "+f); // 1.6
		int num = (int)f;
		System.out.println("num : "+num); // 1
		float f2 = (float)num; // 1.0
		System.out.println("f2 : "+f2);
		
		
		System.out.println("OVERFLOW");

		System.out.printf("\noverflow : "+(byte)200);
		
		
		
	}
}
