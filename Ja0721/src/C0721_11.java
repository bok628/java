import java.util.Scanner;

public class C0721_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름");
		String name = scan.nextLine();
		
		System.out.println("국어 점수");
		int kor = scan.nextInt();
		
		System.out.println("영어 점수");
		int eng = scan.nextInt();
		
		System.out.println("수학 점수");
		int math = scan.nextInt();

		int total = kor + eng + math;
		double avg = total / 3.0;
		
		System.out.printf("이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.println("------------------------------------------------------------");
//		System.out.printf(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg);
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%f",name,kor,eng,math,total,avg);
		
	}

}
