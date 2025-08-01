import java.util.Arrays;
import java.util.Scanner;

public class C0725_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// LOTTO
		int[] arr = new int[45]; // 랜덤번호
		int[] myNo = new int[6]; // 입력번호
		int[] lotto = new int[6]; // 로또번호
		int[] okNo = new int[6]; // 맞춘 번호
		int count = 0;			 // 맞춘 개수
		
		for(int i = 0; i < 6; i++) {
			System.out.println("입력된 번호 : "+Arrays.toString(myNo));
			System.out.println("번호 입력(1-45)");
			myNo[i] = scan.nextInt();
		}
		
		
		// 얕은 복사
		System.arraycopy(arr, 0, lotto, 0, 6);
		
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		// 배열호 출력
		

	}

}
