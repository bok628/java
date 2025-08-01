import java.util.Scanner;

public class C0725_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 번호,이름,국영수,합계,평균
		int[] no = new int[5];
		String[] name = new String[5];
		int[][] score = new int[5][3];
		int[] total = new int[5];
		double[] avg = new double[5];
		int count = 0;		
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		String searchN = "";
		
		// 학생성적프로그램
		while(true) { 
			System.out.println();
			System.out.println("학생성적프로그램");
			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("3.성적수정");
			System.out.println("------------");
		
			System.out.println("원하는 번호 입력");
			int choice = scan.nextInt();
			scan.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("성적입력");
				
				no[count] = count + 1;
				System.out.printf("%d번 학생 이름을 입력하세요. >>",count + 1);
				
				total[count] = 0;
				
				name[count] = scan.next();
					for(int j = 0; j < score[count].length; j++) {
						System.out.printf("%s 과목 성적을 입력하세요. >> ",title[j+2]);
						score[count][j] = scan.nextInt();
						total[count] += score[count][j];
					}
				
				avg[count] = total[count] / 3.0;
				
				count++;
				
				
				System.out.println("성적 입력이 완료되었습니다.");
				
				break;
			case 2:
				System.out.println("성적출력");
				for(int i = 0; i < title.length; i++) {
					System.out.print(title[i]+"\t");
				}
				
				System.out.println();
				System.out.println("-------------------------------------------------------");
				for(int i = 0; i < count; i++) {	
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f",no[i],name[i],score[i][0],score[i][1],score[i][2],total[i],avg[i]);
				}
				System.out.println();
				break;
			case 3:
				System.out.println("성적수정");
				System.out.println("학생 이름을 입력하세요.");
				String search = scan.next();
				for(int i = 0; i < count; i++) {
					if( name[i].contains(search) ) {
						searchN = "name[i]";
						System.out.println();
					}else {
						System.out.println("찾는 학생이 존재하지 않습니다.");
					}
				}
				break;
			}
			
		}

		
		
	}

}
