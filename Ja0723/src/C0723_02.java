import java.util.Scanner;

public class C0723_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("계절 입력");
//		int score = scan.nextInt();
		int mon = scan.nextInt();
		String season = "";
		
		// if,switch
		if (mon == 3 || mon == 4 || mon == 5) {
			System.out.println("spring");
		}else if (mon >=6 && mon <= 8) {
			System.out.println("summer");
		}else if (mon >= 9 && mon <= 11) {
			System.out.println("autumn");
		}else {
			System.out.println("winter");
		}
		
		switch(mon) {
		case 3: case 4: case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
		case 12: case 1: case 2:
			season = "겨울";
		default :
			season = "숫자를 잘못 입력하셨습니다.";
			break;
		}
		
		System.out.println("계절 : "+season);
		
		
		
		
		
		// if
//		if(score >= 90){
//			System.out.println("A");
//		}else if(score >= 80){
//			System.out.println("B");
//		}else if(score >= 70){
//			System.out.println("C");
//		}else if(score >= 60){
//			System.out.println("D");
//		}else{
//			System.out.println("F");
//		}

	}

}
