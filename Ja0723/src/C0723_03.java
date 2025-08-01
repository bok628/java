import java.util.Scanner;

public class C0723_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double rnum = (int)(Math.random() * 10) + 1;
		
		System.out.println("[ 랜덤 숫자 맞추기 ]");
		System.out.println("1-10 중 숫자 입력");
		System.out.println("-------------------");
		int input = scan.nextInt();
		
		// 렌덤 숫자 맞추기
		if (rnum == input) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
			if(rnum > input) {
				System.out.println("입력숫자가 더 작습니다.");
			}else {
				System.out.println("입력숫자가 더 큽니다.");
			}
		}
		
		
		System.out.println("입력 숫자 : "+input);
		System.out.println("랜덤 숫자 : "+(int)rnum);
		
	}

}
