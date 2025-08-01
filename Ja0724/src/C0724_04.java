import java.util.Scanner;

public class C0724_04 {

	public static void main(String[] args) {
		// 입력 번호 6개, 로또 번호 6개 생성 후 출력
		
		// 입력 번호
		Scanner scan = new Scanner(System.in);
		int[] mylotto = new int[6];
		for(int i = 0; i < 6; i++) {
			System.out.printf("%d번째 숫자 입력 (1-45) >> ",i+1);
			int my = scan.nextInt();
			mylotto[i] = my;
		}
		
		
		
		// 로또 샘플 생성
		int[] lotto = new int[6];
		int[] num = new int[45];
		int rnum = 0;
		int storage = 0;
		for(int i = 0; i < 45; i++) {
			num[i] = i+1;
		}
		
		// 로또 번호 섞기
		for (int i = 0; i < 500; i++) {
			rnum = (int)(Math.random() * 45);
			storage = num[0];
			num[0] = num[rnum];
			num[rnum] = storage;
			
		}
		System.out.print("입력번호 : ");
		for(int i = 0; i < 6; i++) {
			System.out.print(mylotto[i]+" ");
		}
		System.out.print("\n로또번호 : ");
		for(int i = 0; i < 6; i++) {
			lotto[i] = num[i];
			System.out.print(lotto[i]+" ");
		}
		
		
		
	}

}
