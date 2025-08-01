import java.util.Scanner;

public class C0724_06 {

	public static void main(String[] args) {
		// 다차원 배열

		Scanner scan = new Scanner(System.in);
		String[] name = new String[3];
		int[][] score = new int[3][3];
		int[] total = new int[3];
		double[] avg = new double[3];
		String[] title = {"국어","영어","수학","합계","평균"};
		
		System.out.println();
		
		for(int i = 0; i < score.length; i++) {
			System.out.printf("이름 입력 : ");
			name[i] = scan.next(); 
			for(int j = 0; j < score[i].length; j++) {
				System.out.printf("%d번째 %s점수 입력 : ",i+1,title[j]);
				score[i][j] = scan.nextInt();
				total[i] += score[i][j];
			}
			avg[i] = total[i] / 3.0;
			System.out.println();
		}
		System.out.println();
		
		// 출력
		System.out.printf("이름\t%s\t%s\t%s\t%s\t%s\n",title[0],title[1],title[2],title[3],title[4]);
		
		for(int i = 0; i < score.length; i++) {
			System.out.print(name[i]+"\t");
			for(int j = 0; j < score[i].length; j++) {				
				System.out.printf(score[i][j]+"\t");
			}
			System.out.printf("%d\t%.2f\n",total[i],avg[i]);
		}
		
//		for(int i = 0; i < score.length; i++) {
//			System.out.printf("%s\t%d\t%d\t%d\n",name[i],score[i][0],score[i][1],score[i][2]);
//		}
		
		
//		int[][] arr = new int[5][5];
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = (5 * i + j) + 1;
//			}
//		}
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}
		
		
		
//		int[][] score = new int[5][3];
//		
//		for(int i = 0; i < score.length; i++) {
//			for(int j = 0; j < score[i].length; j++) {
//				score[i][j] = 3 * i + j; // 0-14
//			}
//		}
//		
//		for(int i = 0; i < score.length; i++) {
//			for(int j = 0; j < score[i].length; j++) {
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
//		
//		
//		
//		int[] num = new int[5];
//		for(int i = 0; i < num.length; i++) {
//			num[i] = i; // 0,1,2,3,4
//			
//		}
		
	}

}
