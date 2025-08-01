import java.util.Scanner;

public class C0721_08 {

	public static void main(String[] args) {
		// input("");
		// Scanner 호출 후 사용
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("입력한 숫자 : "+num);
		System.out.println("숫자를 입력하세요.");
		String str = scan.nextLine(); // 띄어쓰기까지 같이 받을 수 있음
		int num2 = Integer.parseInt(str);
		System.out.println("숫자 더하기 : "+(num + num2));
		
		
		
		
		
		
		
		
		// next(), nextLine() : 문자열
		// nextByte(), nextShort(), nextInt(), nextLong()
		// nextFloat(), nextDouble()
		
		
//		String str = "abc";
//		String str2 = new String("abc");
//		int a = 100;
		
		
	}

}
