import java.util.Scanner;

public class C0722_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("문자 입력");
		String input = scan.next();
		String str1 = "c";
		
		// String : equals()
		if(input.equals("c") || input.equals("C")) {
			System.out.println("프로그램 종료");
		}else {
			System.out.println("프로그램 종료가 안됩니다.");
		}
		
		if(input.equalsIgnoreCase("c")) {
			System.out.println("프로그램 종료");
		}else {
			System.out.println("프로그램 종료가 안됩니다.");
		}
	}

}
