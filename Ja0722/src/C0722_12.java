import java.util.Scanner;

public class C0722_12 {

	public static void main(String[] args) {
		// SWITCH : 대소비교 X
		// 02 : 서뤃 , 031 : 경기, 032 : 인천
		Scanner scan = new Scanner(System.in);
		System.out.println("국번 입력");
		
		int input = scan.nextInt();
		
		switch(input) {
		case 2: 
			System.out.println("서울");
			break;
			
		case 31:
			System.out.println("경기");
			break;
			
		case 32:
			System.out.println("인천");
			break;
			
		default : 
			System.out.println("지정되지 않음.");
			break;
		}
		
		
		// 1-3 랜덤숫자
		int rnum = (int)(Math.random() * 3) + 1;
		
		// 가위 - 1 바위 - 2 보 - 3
		// 1-3 ,2-1,3-2 - 승리
		// 1-1,2-2,3-3 - 무승부
		// 1-2,2-3,3-1 - 패
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
		
		int result = choice - rnum;
		switch(result){
		case -2:case 1:
			System.out.println("승리");
			break;
		case 0 :
			System.out.println("무승부");
			break;
		case -1:case 2:
			System.out.println("패배");
			break;
		default : 
			System.out.println("숫자를 잘못 입력하셨습니다.");
			break;
		}
		
		switch(choice) {
		case 1: 
			my = "가위";
			break;
		case 2:
			my = "바위";
			break;
		case 3:
			my = "보";
			break;
		}
		System.out.println("선택 : "+my);
		
		
		switch(rnum) {
		case 1: 
			you = "가위";
			break;
		case 2:
			you = "바위";
			break;
		case 3:
			you = "보";
			break;
		}
		System.out.println("랜덤 : "+you);
	}

}
