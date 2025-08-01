import java.util.Scanner;

public class C0724_07 {

	public static void main(String[] args) {
		// 이름,국어,영어,수학 점수를 입력받아 출력하기
		//1. 변수 배열 선언
		String[] name = new String[3];
		int[][] score = new int[3][3];
		int[] total = new int[3];
		double[] avg = new double[3];
		String[] title = {"국어","영어","수학","합계","평균"};
		
		//2. 입력
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < score.length; i++) {
			System.out.printf("%d번째 학생 이름 입력 : ",i+1);
			name[i] = scan.next();
			for(int j = 0; j < score[i].length; j++) {
				System.out.printf("%d번째 학생 %s점수 입력 : ",i+1,title[j]);
				score[i][j] = scan.nextInt();
				total[i] += score[i][j];
			}
			avg[i] = total[i] / 3.0;
		}
		//3. 출력
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		for(int i = 0; i < score.length; i++) {
			System.out.printf(name[i]+"\t");
			for(int j = 0; j < score[i].length; j++) {
				System.out.printf(score[i][j]+"\t");
			}
			System.out.printf("%d\t%.2f\n",total[i],avg[i]);
		}
		System.out.println();
		
		
	}

}
