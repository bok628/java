import java.util.Scanner;

public class C0723_04 {

	public static void main(String[] args) {
		
		
		int a = 1;
		int b = 2;
		// 같은 타입일 경우 
		int c,d = 0;
		int e = 0, f = 10;
		// 다른 타입 XX
		// int g = 0, double h = 0;
		
		
		Scanner scan = new Scanner(System.in);
		int rnum = (int)(Math.random() * 10) + 1;
		int num = 0;
		for(int i = 1; i<=5; i++) {
			// 숫자 맞추기 프로그램
			System.out.printf("숫자를 입력하세요.(%d번째)\n",i);
			System.out.println("-------------------");
			num = scan.nextInt();
			
			if (rnum == num) {
				System.out.println("정답");
				break;
			}
			else{
				System.out.println("오답");
				
				if (rnum > num) {
					System.out.println("입력 숫자가 더 작습니다.");
				}
				else {
					System.out.println("입력 숫자가 더 큽니다.");
				}
			}
			
			
		}
		System.out.printf("입력 숫자 : %d \n랜덤 숫자 : %d",num,rnum);
		
		
		
		
		
		// 1-10 55 1-100 5050 1-1000 500500 1-10000 50005000
//		int sum = 0;
//		int i = 0;
//		for(i = 1; i <= 10; i++) {
//			sum += i;			
//		}
//		System.out.printf("1 - %d까지의 합 \n%d\n",(i-1),sum);
		
		// 반복문 : for,while
//		for(int i = 0; i < 10; i+=2) {
//			System.out.println(i);
//		}
		
//		System.out.println("---------------------------");
//		int j = 0;
//		while(j < 10) {
//			j++;
//			System.out.println(j);
//		}
//		
//		System.out.println("---------------------------");
//		// do while
//		int k = 0;
//		do {
//			System.out.println(k);
//			k++;
//		}while(k < 10);
			
		

	}

}
