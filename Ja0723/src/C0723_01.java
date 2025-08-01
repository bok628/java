import java.util.Scanner;

public class C0723_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[ 덧셈 프로그램 ]");
		System.out.println("1. 21억 이하 덧셈");
		System.out.println("2. 21억 이상 덧셈");
		System.out.println("------------------");
		System.out.println("원하는 번호를 입력하세요.");

		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("숫자 1");
			int num1 = scan.nextInt();
			
			System.out.println("숫자 2");
			int num2 = scan.nextInt();
			
			int total = num1 + num2;
			
			System.out.println("덧셈 : "+total);
			break;
		case 2:
			System.out.println("숫자 1");
			long numl1 = scan.nextLong();
			
			System.out.println("숫자 2");
			long numl2 = scan.nextLong();
			
			long totalL = numl1 + numl2;
			
			System.out.println("덧셈 : "+totalL);
			
			break;
		default : 
		
			break;
		}
		
		
		
//		System.out.println("숫자 입력");
//		int input = scan.nextInt();
//		System.out.println("숫자2 입력");
//		int input2 = scan.nextInt();
//		
//		System.out.println("입력숫자 : "+input);
//		System.out.println("입력숫자2 : "+input2);
//		System.out.println("합 : "+(input + input2));
//		
//		long num = input + (long)input2; 
//		
//		System.out.println(num);
		
		
	}

}
