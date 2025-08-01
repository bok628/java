import java.util.Scanner;

public class C0723_08 {

	public static void main(String[] args) {
		
		// 배열 1-100
		int[] list = new int[100];
		
		for(int i = 0; i < 100; i++) {
			list[i] = i+1;
			System.out.println(list[i]);
		}
		
		// 5개의 숫자를 입력받아, 배열에 넣어 출력
		Scanner scan = new Scanner(System.in);
		int[] n = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.println("숫자 입력");
			n[i] = scan.nextInt();
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(n[i]);
		}
		
		
		
		
		
		
		
		
		
		
		int score0 = 0, score1 = 1, score2 = 2, score3 = 3, score4 =4, score5 =5;
		int[] s = new int[6];
		s[0] = 0;
		s[0] = 1;
		s[0] = 2;
		s[0] = 3;
		s[0] = 4;
		s[0] = 5;
		
		System.out.println();
		
		
			// 배열 (같은 타입만 가능)
//		int score = 0, score2 = 0, score3 = 0, score4 = 0, score5 = 0;
//		System.out.println(score);
//		System.out.println(score2);
//		System.out.println(score3);
//		System.out.println(score4);
//		System.out.println(score5);
//		
//		int[] s = new int[100];
//		for(int i = 0; i < 100; i++) {
//			System.out.println(s[i]);
//		}
		
	}

}
