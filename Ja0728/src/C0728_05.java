import java.util.Scanner;

public class C0728_05 {

	public static void main(String[] args) {
		// 홍길동 100 100 100 300 100.0
		// 객체에 대한 배열을 선언 후 출력
		// Student[] students = new Student[3];
		
		Scanner scan = new Scanner(System.in);
		
		Stuscore[] s = new Stuscore[3]; // 배열 선언
		for(int i = 0; i < s.length; i++) {
			s[i] = new Stuscore(); 			// 객체 선언
			System.out.print("이름 입력 : ");
			s[i].name = scan.next();
			System.out.print("국어점수 입력 : ");
			s[i].kor = scan.nextInt();
			System.out.print("영어점수 입력 : ");
			s[i].eng = scan.nextInt();
			System.out.print("수학점수 입력 : ");
			s[i].math = scan.nextInt();
			s[i].stuTotal();
			s[i].stuAvg();
			
		}
		
//		s[1] = new Stuscore();
//		s[1].name = "유관순";
//		s[1].kor = 91;
//		s[1].eng = 90;
//		s[1].math = 90;
//		s[1].total = s[1].kor + s[1].eng + s[1].math;
//		s[1].avg = s[1].total / 3.0;
//		
//		s[2] = new Stuscore();
//		s[2].name = "이순신";
//		s[2].kor = 80;
//		s[2].eng = 80;
//		s[2].math = 80;
//		s[2].total = s[2].kor + s[2].eng + s[2].math;
//		s[2].avg = s[2].total / 3.0;
		
		System.out.print("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("-----------------------------------------------");
		for(int i = 0; i < s.length; i++) {
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",s[i].name,s[i].kor,s[i].eng,s[i].math,s[i].total,s[i].avg);
		}
		
 		
	}

}
