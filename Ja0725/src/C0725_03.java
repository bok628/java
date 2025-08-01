import java.util.Scanner;

public class C0725_03 {

	public static void main(String[] args) {

		System.out.println("a");
		System.out.println("b");
		System.out.println("c");
		
		int h = 123;
		System.out.printf("%5d",h);
		System.out.printf("  %05d\n",h);
		
		// 문자열 - nextLine() : 엔터키까지 출력 next : 문자만 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 입력");
		String a = scan.next();
		System.out.println("ID 입력");
		// b에 엔터가 출력되는 걸 방지
		scan.nextLine();
		String b = scan.nextLine();
		
		System.out.println("이름 : "+a);
		System.out.println("ID : "+b);
		
		
		// nextInt(), nextLong(), nextByte(), nextShort()
		// nextDouble(), nextFloat()
		System.out.println("숫자 입력");
		int c = scan.nextInt();
		System.out.println("숫자 : "+c);
		
		
		
		
	}

}
