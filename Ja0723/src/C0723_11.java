import java.util.Scanner;

public class C0723_11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[2];
		int[] kor = new int[2];
		int[] eng = new int[2];
		int[] math = new int[2];
		int[] total = new int[2];
		double[] avg = new double[2];
		
		for(int i=0; i < name.length; i++) {
			System.out.print("이름 입력 : ");
			name[i] = scan.next(); 
			
			System.out.print("국어 입력 : ");
			kor[i] = scan.nextInt();
			
			System.out.print("영어 입력 : ");
			eng[i] = scan.nextInt();
			
			System.out.print("수학 입력 : ");
			math[i] = scan.nextInt();
			
			total[i] = kor[i] + eng[i] + math[i];
			avg[i] = total[i]/3.0;
			
		}
		
			System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t");
			System.out.println("----------------------------------------------");			
			for(int i = 0; i < name.length; i++) {				
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name[i],kor[i],eng[i],math[i],total[i],avg[i]);
			}
			
			
		
		
	}

}
