import java.util.Scanner;

public class C0723_05 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
			if(sum > 500) {
				System.out.println(i-1);
				System.out.println(sum-i);				
				break;
			}
		}
		
		
//		for(int i = 1; i <= 100; i++) {
//			sum += i;
//			if(sum > 100) {
//				System.out.println(i);
//				System.out.println(sum);				
//				break;
//			}
//		}
		
		
		
		// 두 수를 입력받아 n-m까지의 합
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자1");
//		int num1 = scan.nextInt();
//		System.out.println("숫자2");
//		int num2 = scan.nextInt();
//		int num3 = 0;
//		
//		if(num1<num2) {
//			System.out.println("");
//		}else {
//			num3 = num2;
//			num2 = num1;
//			num1 = num3;
//		}
//		
//		int total = 0;
//		for (int i = num1; i <= num2; i++) {
//			
//			total += i;
//		}
//		System.out.println(total);
			
		
				
	}

}
