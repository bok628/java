import java.util.Arrays;
import java.util.Scanner;

public class C0728_13 {

	public static void main(String[] args) {
		// 소수점 입력 후 2자리에서 반올림
		// 1.256 -> 2 / 1.3
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.>> ");
		double input = scan.nextDouble();
//		System.out.printf("2자리에서 반올림 : "+(double)(Math.round(input*10))/10);
		
		System.out.print("\n자리수를 입력하세요.>> "); 
		int num = scan.nextInt();
//		System.out.println("원하는 자리에서 반올림 : "+(double)(Math.round(input*Math.pow(10,num-1))/Math.pow(10,num-1)));
		
		// 반올림,올림,버림
		double[] number = new double[3];
		
		
		Cal c = new Cal();
		c.powProcess(input,num,number);
		
		System.out.println("결과(반올림/올림/버림) : "+Arrays.toString(number));
		
		
	}

}
