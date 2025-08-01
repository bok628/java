import java.util.Scanner;

public class C0722_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자 입력");
		String input = scan.next();
		char ch = input.charAt(0);

		// 숫자인지 아닌지
		if(ch >= '0' && ch <= '9') {
			System.out.println("숫자입니다.");
		}else {
			System.out.println("숫자가 아닙니다.");
		}
		
		
		// 첫 글자가 영어인지 아닌지 확인
//		if((ch>='a'&&ch<='z') || (ch>='A'&&ch<='Z')) {
//			System.out.println("영문자입니다.");
//		}else {
//			System.out.println("영문자가 아닙니다.");
//		}

		System.out.println("문자 : "+input);
		System.out.println("문자 1글자: "+ch);
		

	}

}
