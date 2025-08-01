import java.util.Scanner;

public class C0728_09 {
	
	public static void main(String[] args) {
		// a,b 입력받아 사칙연산 프로그램 만들기
		Cal c = new Cal();
		Scanner scan = new Scanner(System.in);
		System.out.println("두 수를 입력하세요.");
		int a = scan.nextInt();
		int b = scan.nextInt();
				
		System.out.println("[ 사칙연산 프로그램 ]");
		System.out.println("1. 더하기");
		int result = c.add(a, b);
		System.out.println(result);
		System.out.println("2. 빼기");
		int minus = c.minus(a, b);
		System.out.println(minus);
		System.out.println("3. 곱하기");
		int multi = c.multi(a, b);
		System.out.println(multi);
		System.out.println("4. 나누기");
		double divide = c.divide(a, b);
		System.out.println(divide);
		
		
		
		
	}
	
}
