import java.util.Arrays;
import java.util.Scanner;

public class C0728_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력맞추기 프로그렘
		Scanner scan = new Scanner(System.in);
		
		//객체 선언
		Process p = new Process(); // p 참조변수
		//// 참조변수
		/// 주소값을 가짐.(like 배열)
		
		System.out.println("[ 숫자 프로그램 ]");
		System.out.println("[ 1. 숫자 맞추기 ]");
		System.out.println("[ 2. 로또 맞추기 ]");
		System.out.println("[ 3. 구구단 ]");
		System.out.println("[ 4. 결과 리턴(return 사용 없이) ]");

		System.out.println("번호 입력");
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			p.numProcess();
			break;
		case 2:
			int[] myNo = new int[6];	// 참조변수
			int[] lotto = new int[6];	// 참조변수
			int[] okNo = new int[6];	// 참조변수
//			int count = 0;				// 기본변수 : 주소값이 없으므로 return
			
			// Process.java에 메소드를 구현해서 입력번호 로또번호 맞춘번호 출력
			p.Lotto(myNo,lotto,okNo);
			
			break;
		case 3 :
			System.out.println("          구구단");
			System.out.println("------------------------");
			System.out.println("2-n단을 출력하는 n을 입력하세요.");
			int n = scan.nextInt();
			
			p.multiple(n);
			break;
		case 4:
			// 두 수를 입력받아(10,5) +-*/의 값 출력
			double[] result = {0,0,0,0};
			int a = 10;
			int b = 5;
			p.resultProcess(a, b, result);
			System.out.println(Arrays.toString(result));
			
			break;
		}
	}

}
