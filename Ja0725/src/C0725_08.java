import java.util.Arrays;
import java.util.Scanner;

public class C0725_08 {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		// 로또번호 맞추기
		int[] num = new int[45];
		int[] lotto = new int[6];
		int[] myNo = new int[6];
		int[] okNo = new int[6];
		int count = 0;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		
		// shuffle
		int temp= 0 ;
		int rnum = 0 ;
		for(int i = 0; i < 221; i++) {
			rnum = (int)(Math.random() * 45);
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		
		// 로또 번호 복사
		System.arraycopy(num, 0, lotto, 0, 6);

		for(int i = 0; i < 6 ; i++) {
			System.out.println("숫자 입력(1-45)");
			myNo[i] = scan.nextInt();			
		}
		
		// 출력
//		System.out.println();
//		System.out.print("입력 번호 : ");
//		for(int i = 0; i < 6 ; i++) {
//			System.out.print(myNo[i]+"\t");
//		}
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(myNo[i]==lotto[j]) {
					okNo[count] = myNo[i]; 
					count++;
					break;
				}
			}
		}
		
		System.out.println("입력 번호 : "+Arrays.toString(myNo));
		System.out.println("로또 번호 : "+Arrays.toString(lotto));
		System.out.print("맞춘 번호 : ");
		for(int i = 0; i < count; i++) {
			System.out.print(okNo[i]+",");
		}
		System.out.println();
		System.out.println("정답 개수 : "+count);
	}

}
