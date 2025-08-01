import java.util.Scanner;

public class C0722_02 {

	public static void main(String[] args) {
		// INPUT
		Scanner scan = new Scanner(System.in);
		System.out.println("이름");
		String name = scan.next();
		
		System.out.println("국어");
		int kor = scan.nextInt();
		
		System.out.println("수학");
		int math = scan.nextInt();
		
		System.out.println("영어");;
		int eng = scan.nextInt();
		
		int total = kor + math + eng;
				
		System.out.println("이름\t국어\t영어\t수학\t합계");
		System.out.println("-----------------------------------------");
		System.out.printf("%s\t%d\t%d\t%d\t%05d",name,kor,eng,math,total);
		
	}

	
}
