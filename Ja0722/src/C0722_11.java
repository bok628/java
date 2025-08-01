import java.util.Scanner;

public class C0722_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1-100 랜덤숫자 0~100
		int rnum = (int)(Math.random() * 3) + 1;
		
		// 가위 - 1 바위 - 2 보 - 3
		// 1-3,2-1,3-2 - 승리
		// 1-1,2-2,3-3 - 무승부
		// 2-2,2-3,3-1 - 패
		// if 사용해서 가위바위보 게임을 완성하시오.
		System.out.println("[가위바위보 게임]");
		System.out.println("1. 가위");
		System.out.println("2. 바위");
		System.out.println("3. 보");
		System.out.println("----------------------");
		System.out.println("원하는 번호를 입력하세요.>>");
		int choice = scan.nextInt();
		String my = "";
		String you = "";
		
		if(choice - rnum == -2 || choice - rnum == 1 ) {
			System.out.println("승리");
			System.out.println("승리");
		}
		else if(choice == rnum) {
			System.out.println("무승부");
		}
		else{
			System.out.println("패");
		}
		
		
		
		
//		// 0.0 <= random < 1.0
//		double num = Math.random();
//		System.out.println(num);
//		num = Math.floor(num * 10) / 10;
//
//		System.out.println(Math.floor(Math.random() * 10)/10.0);
//		
//		// 0 <= random < 10
//		// 1 <= random < 11 
//		System.out.println((int)(Math.random() * 10));
//		System.out.println((int)(Math.random() * 10) + 1);
		
		
		
//		boolean power = false;
//		if(!power) {
//			power = true;
//		}
		
		
		
		
//		
//		System.out.println("문자 입력");
//		String input = scan.nextLine();
//		char ch = ' ';
//		
//		// Null 때 에러 방지
//		if(input != null && !input.equals("")) {
//			ch = input.charAt(0);			
//		}
//		
//		System.out.println("출력 : "+ch);

	}

}
