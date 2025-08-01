import java.util.Scanner;

public class C0722_05 {

	public static void main(String[] args) {
		
		double d = 0.1f; // 0.100000001490...
		System.out.println(d);
		
		double d_2 = 0.1;
		
		if('A'== 65) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		
		// 몫
		int share = 10/8;
		System.out.println(share);
		
		// 나머지
		int remain = 10%8;
		System.out.println(remain);

		
		double share2 = 10/8.0;
		System.out.println(share2);

		
		Scanner scan = new Scanner(System.in);
		System.out.println("문자 입력");
		String txt = scan.next();
		char ch = txt.charAt(0); // 0번째 문자 
		
		System.out.println("입력문자 : "+txt);
		System.out.println("1글자 : "+ch);
		
		
		
		
		
		System.out.println("숫자 입력");
		int input = scan.nextInt();
		
		// 1-10 에 해당하는 숫자인지 확인하여 특정 문구 출력
		if (1 <= input && input <= 10) {
			System.out.println("1-10 숫자 중 하나");
		}else {
			System.out.println(".");
		}
		
		
//		if(input % 2 == 0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}
		
		// 숫자를 입력받아, 10보다 큰수인지 작은수인지 출력
		System.out.println("숫자 입력");
		int num = scan.nextInt();
		if (num > 10) {
			System.out.println("10보다 큰 수입니다.");
		}else if (num < 10) {
			System.out.println("10보다 작은 수입니다.");
		}else {
			System.out.println("10입니다.");
		}
		
		
		
		
		
	}

}
