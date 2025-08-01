
public class C0724_14 {

	public static void main(String[] args) {
		// 1차원 배열
		int[] num = new int[25];
		for(int i = 0; i < num.length; i++) {
			num[i] = i+1;
		}
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		// 번호 섞기
		System.out.println("번호 섞기");
		int rnum = 0;
		int temp = 0;
		for(int i = 0; i < 628; i++) {
			rnum = (int)(Math.random() * 25);
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		// 2차원 배열로 출력
		int[][] num2 = new int[5][5];
		System.out.println("2차원 배열");
		for(int i = 0; i < num2.length; i++) {
			for(int j = 0; j < num2[i].length; j++) {
				num2[i][j] = num[5 * i + j];
			}
		}
		
		for(int i = 0; i < num2.length; i++) {
			for(int j = 0; j < num2[i].length; j++) {
				System.out.printf("%d\t",num2[i][j]);
			}
			System.out.println();
		}
	}

}
