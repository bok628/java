import java.util.Scanner;

public class C0723_09 {

	public static void main(String[] args) {

//		int[] score = {10,20,5,2,3};
//		// 배열 길이
//		for(int i = 0; i<score.length; i++) {
//			System.out.println(score[i]+" ");
//		}
		
		// 1-100 랜덤숫자 생성하여 5번 입력하게 함
		Scanner scan = new Scanner(System.in);
		int[] input = new int[20];
		
		int rnum = (int)(Math.random() * 100) + 1;
		for(int i = 0; i < input.length; i++) {
			System.out.printf("숫자 입력(%d번째) : ",i+1);
			input[i] = scan.nextInt();
			
			if(rnum == input[i]) {
				System.out.println("정답");				
				break;
			}
			else {
				System.out.println("오답");
				System.out.println("입력 숫자 : "+input[i]);
				if(rnum > input[i]) {
					System.out.println("입력한 숫자가 더 작습니다.");
				}
				else if(rnum < input[i]){
					System.out.println("입력한 숫자가 더 큽니다.");
				}
			}
		}
		for(int i = 0; i < input.length; i++) {			
			System.out.print(input[i]+" ");				
		}
		System.out.println("\n랜덤 숫자 : "+rnum);
		
	}

}
