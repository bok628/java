import java.util.Arrays;
//import java.util.Collections;
import java.util.Scanner;

public class C0724_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] input = new int[6];
		for(int i = 0; i < 6; i++) {
			System.out.printf("%d번째 숫자 입력 : ",i+1);
			input[i] = scan.nextInt();
			
		}

		// 숫자 정렬 - Arrays.sort (순차정렬)
		Arrays.sort(input);
		// 역순정렬(객체타입만 가능)
		// Arrays.sort(input,Collections.reverseOrder());
		System.out.println("입력 번호 : "+Arrays.toString(input));
		
	}

}
