import java.util.Scanner;

public class C0721_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자1 입력");
		int num1 = scan.nextInt();
		System.out.println("num1 : "+num1);
		
		System.out.println("숫자2 입력");
		String str = scan.next();
		System.out.println("str : "+str);
		
		int num2 = Integer.parseInt(str);
		System.out.println("num1 + num2 : "+ (num1+num2));
		

	}

}
