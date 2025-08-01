import java.util.Arrays;

public class C0724_12 {

	public static void main(String[] args) {
		// 1-25 숫자 자동입력 후 번호를 섞어서 출력
		int[] num = new int[25];
		int[][] arr = new int[5][5];
		
		// 번호 입력
		for(int i = 0; i < num.length; i++) {
			num[i] = i+1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num[5*i+j];
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t",arr[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		

		
		// 랜덤 섞기
		int temp = 0;
		
		for(int i = 0; i < 300; i++) {
			int rnum = (int)(Math.random() * 25);
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		
		// 번호 출력
		for(int i = 0; i < num.length; i++) {
			System.out.print("\n"+num[i]+" ");
		}
	}

}
