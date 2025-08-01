import java.util.Scanner;

public class C0724_10 {

	public static void main(String[] args) {
		// 1. 변수배열선언
		Scanner scan = new Scanner(System.in);
		
		int[] no = new int[3];
		String[] name = new String[3];
		int[][] score = new int[3][3];
		int[] total = new int[3];
		double[] avg = new double[3];
		int count = 0;
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		
		// 2. 출력구문 - while(true), switch 구문 
		loop:while(true) {
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("----------------");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("4. 등록취소");
			System.out.println("0. 프로그램종료");
			System.out.println("----------------");
			System.out.print("원하는 번호를 입력하세요. >> ");
			int choice = scan.nextInt();
			
			switch(choice) {
			// 3. 입력
			case 1:
				System.out.println("[ 학생성적입력 ]");
				// 학생번호
				no[count] = count + 1;
				// 이름
				System.out.printf("%d번 학생 이름을 입력하세요. >> ",count + 1);
				name[count] = scan.next();
				// 성적
				for(int i = 0; i < score.length; i++) {
					System.out.printf("%s 성적을 입력하세요. >> ",title[i+2]);
					score[count][i] = scan.nextInt();
					total[count] += score[count][i];
				}
				avg[count] = total[count] / 3.0;
				
				System.out.printf("%d번 학생 정보가 저장되었습니다.\n",count + 1);
				count++;
				break;
			// 5. 출력
			case 2:
				System.out.println("[ 학생성적출력 ]");
				for(int i = 0; i < title.length; i++) {
					System.out.printf("%s\t",title[i]);
				}
				System.out.println("\n--------------------------------------------------");
				for(int i = 0; i < count; i++) {
					System.out.printf("%d\t%s\t",no[i],name[i]);
					for(int j = 0; j < score[i].length; j++) {
						System.out.printf("%d\t",score[i][j]);
					}
					System.out.printf("%d\t%f\n",total,avg);
				}
				break;
			// 4. 취소
			case 3:
				
				break;
			// 6. 프로그램 종료
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loop;
			}
	
		}
		

	}

}
