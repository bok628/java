import java.util.Scanner;

public class C0722_07 {

	public static void main(String[] args) {
		// 삼항식
		Scanner scan = new Scanner(System.in);
		

		
		System.out.println("숫자1 입력");
		int n1 = scan.nextInt();
		
		System.out.println("숫자2 입력");
		int n2 = scan.nextInt();
		
		System.out.println("숫자3 입력");
		int n3 = scan.nextInt();
		
		// 제일 큰 수 출력
		int bigN = n1>n2?(n1>n3?n1:n3):(n2>n3?n2:n3);
		System.out.println("결과 : "+bigN);
		System.out.printf("n1 : %d\tn2 : %d\t n3 : %d \n",n1,n2,n3);
		
		
		
//
//		// 대소비교
//		String result4 = x>x2?"숫자1이 크다":x==x2?"같다":"숫자2가 크다";
//		System.out.println(result4);
//		
//		// 삼항식을 이용해 60점 이상 => 합격/미만 => 불합격
//		String result2 = x>=60?"합격":"불합격";
//		System.out.println(result2);
//		
//		// 다중 삼항식
//		String result3 = x>0?"0보다 크다":x==0?"0이다":"0보다 작다";
//		System.out.println(result3);
		
		
//		int x = -10;
//		int absX = x >= 0 ? x : -x;
//		System.out.println(absX);
		
//		if (x % 2 == 0) {
//			System.out.println("짝");
//		}else {
//			System.out.println("홀");
//		}
		
//		String result = x%2==0?"짝":"홀";
		
//		System.out.println(result);
		
	}

}
