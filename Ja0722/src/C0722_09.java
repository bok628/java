import java.util.Scanner;

public class C0722_09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력");
		int score = scan.nextInt();
		
		// 90-A 80-B 70-C 60-D    F
		if(score >= 90) {
			String result = "A";
			if(score >= 97) {
				result += "+";
			}else if(score <= 94) {
				result += "-";
			}
			System.out.println(result);
		}else if(score >= 80) {
			String result = "B";
			if(score >= 87) {
				result += "+";
			}else if(score <= 84) {
				result += "-";
			}	
			System.out.println(result);
		}else if(score >= 70) {
			System.out.println('C');
		}else if(score >= 60) {
			System.out.println('D');
		}else {
			System.out.println('F');
		}



//		// 양수, 0, 음수
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자 입력 : ");
//		int input = scan.nextInt();
//		
//		if (input>0) {
//		System.out.println("양수입니다.");
//	}else if (input==0) {
//		System.out.println("음수입니다.");
//	}else {
//		System.out.println(" ")변습진 ;
//		

	}
}
