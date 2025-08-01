import java.util.Scanner;

public class C0724_01 {

	public static void main(String[] args) {
		
		// 배열
		// 1. 크기 지정
//		int[] arr = new int[5];
//		
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
//		for(int i = 0; i < 5; i++) {
//			arr[i] = i+1;
//		}
//		// 2. 크기&요소 지정
//		int[] arr2 = {1,2,3,4,5};
//		int[] arr3 = new int[] {1,2,3,4,5};
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

		
		// 이름 5개 입력 후 출력
		// 국영수 합계 평균 출력
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] total = new int[5];
		double[] avg = new double[5];
		for(int i = 0; i < 5; i++) {
			System.out.printf("%d번 학생 이름을 입력하시오. >>",i+1);
			String n = scan.next();
			System.out.printf("국어 점수를 입력하시오. >>");
			int k = scan.nextInt();
			System.out.printf("영어 점수를 입력하시오. >>");
			int e = scan.nextInt();
			System.out.printf("수학 점수를 입력하시오. >>");
			int m = scan.nextInt();
			
			name[i] = n;
			kor[i] = k;
			eng[i] = e;
			math[i] = m;
			total[i] = k + e + m;
			avg[i] = total[i] / 3.0;
			
		}
		System.out.println("성적리스트");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("-----------------------------------------------");
		for(int i = 0; i < 5; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name[i],kor[i],eng[i],math[i],total[i],avg[i]);
		}
		
		
		
	}

}
