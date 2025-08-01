
public class C0721_04 {

	public static void main(String[] args) {
		boolean power = true;
		char ch = 'A';
		// 백슬래시 + u : 16진수로 표현
		// char에 숫자를 넣을 시 아스키코드에 해당되는 문자 출력
		char ch2 = '\u0041';  // 16^^0 * 1 + 16^^1 * 4	= 65
		char ch3 = 42;
		char tab = '\t';
		char enter = '\n';
		
		System.out.println("power : "+power);
		System.out.println("ch : "+ch);
		System.out.println("ch2 : "+ch2);
		System.out.println("ch3 : "+ch3);
		System.out.println("aaa"+ch3+"bbb");
		System.out.println("aaa"+tab+"bbb");
		System.out.println("aaa"+enter+"bbb");
		// ""안에 \t \n 넣을시 작동
		System.out.println("aaa\tb\nbbb");
		
		byte b = 127;
		System.out.println("byte : "+b);
	
		// 16진수 : 0x + 숫자
		int hex = 0x100;
		System.out.println("hex : "+hex);
		
		// 8진수 : 0 + 숫자
		int oct = 0100;
		System.out.println("oct : "+oct);
		
//		long l = 10000000000L;
//		float f = 3.14F;
//		double d = 3.14;
//		double d2 = 3.14D;
		double d4 = 100;
		
		System.out.println("double : "+d4);
		
		
	}
	
}
