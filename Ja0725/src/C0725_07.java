
public class C0725_07 {

	public static void main(String[] args) {
		// 다차원 배열
//		int[][] score = new int[5][3];
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 3; j++) {
//				score[i][j] = (3 * i + j) + 1;
//			}
//		}
//		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 3; j++) {
//				System.out.print(score[i][j] + "\t");
//			}
//			System.out.println();
//		}
		
		// 1차원 배열 1-25를 랜덤으로 섞어ㅓ 출력
		int[] num = new int[25];
				
		for(int i = 0; i < num.length; i++) {
			num[i] = i+1;
		}
		System.out.println("순차출력");
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		
		int rnum = 0;
		int temp = 0;
		for(int i = 0; i < 628; i++) {
			rnum = (int)(Math.random() * 25);
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		System.out.println();
		System.out.println("랜덤출력");
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		
		// 2차원 배열에 대입
		int[][] num2 = new int[5][5];
		for(int i = 0; i < num2.length; i++) {
			for(int j = 0; j < num2[i].length; j++) {
				num2[i][j] = num[5 * i + j];
			}
		}
		System.out.println("\n2차원 배열");
		for(int i = 0; i < num2.length; i++) {
			for(int j = 0; j < num2[i].length; j++) {
				System.out.print(num2[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}

}
