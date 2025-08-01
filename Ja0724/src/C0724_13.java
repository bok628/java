import java.util.Scanner;

public class C0724_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1-25까지 숫자 입력, 랜덤으로 번호를 섞은 후 arr배열에 입력해서 출력
		int[] num = new int[25];
		String[][] arr = new String[5][5];
		
		for(int i = 0;i < num.length; i++) {
			num[i] = i+1;
		}
		
		int temp = 0;
		int rnum = 0;
		for(int i = 0; i < 628; i++) {
			rnum = (int)(Math.random() * 25);
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num[5*i+j]+"";
			}
		}
		while(true) {
		System.out.println("            [ 2차원 배열 ]");
		System.out.println("-----------------------------------");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%s\t",arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");
		System.out.println("원하는 번호를 입력하세요.");
		String input = scan.next();
		
		// 입력된 번호에 해당되는 숫자에 문자 넣기
		loop : for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(input.equals(arr[i][j])) {
					arr[i][j] = "X";
					break loop;
				}
			}
		}			
		}
	}

}
