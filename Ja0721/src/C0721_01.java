// 최소단위 class(=app)
public class C0721_01 {

	public static void main(String[] args) {
//		print("안녕하세요."); XX & ""만 가능
		// method(함수)
		System.out.println("안녕하세요.");
		System.out.println("자바 시작");
		
		//-----------------------------------
		// 변수타입 - 8개

		
		// Char : 홑따옴표만 가능 / 문자열 X
		// char a = "ab"; XX
		char c = 'A';
		char c2 = 'B';
		System.out.print(c);
		System.out.print(c2);

		// 문자열 변수 str : "" 쌍따옴표로 쓰기
		String str = "AB";
		System.out.println(str); 
		
		
		// Boolean : true / false
		// 따옴표 없이 작성
		boolean b = true;
		boolean b2 = false;
		
		
		// 정수형 : byte / short / int(기본형) / long 
		// int : ~21억 int i = 2200000000; XX
		int i = 10;
		int i2 = 2000;
		int i3 = -200000;
		
		// byte : -128~127
		
		// short : -32763~32nnn
		
		// long : ~900경
		// 약 22억부터 L표기 long a = 숫자 + L;
		long h = 2200000000L;
		long h2 = 5L;
		long h3 = -222222222222222L;
		
		
		// 실수형 : float / double(기본형)
		// 소수점의 유효성 : float - 8자리(+F) / double : 15자리
		// 1.1234567 890 ( float : 890은 정확도 보장 X)
		float f = 1.1F;	// 접미사 F
		double d = 1.1; // 기본형 접미사(D,d) 생략
		
		
		
		
		
		
		
	}

}