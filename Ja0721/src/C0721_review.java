import java.util.Scanner;

public class C0721_review {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자");
		double num = scan.nextDouble();
		
		System.out.println("문자");
		String str = scan.next();
		
		int str2 = Integer.parseInt(str);
		
		double nXs = num * str2;
		
		System.out.println(nXs);
		
		char a = 45;
		System.out.println(a);
		System.out.println(++a);
		System.out.println((char)(3)+a);
		System.out.println((char)(3+a));
		
		
	
		
		
	}

}
