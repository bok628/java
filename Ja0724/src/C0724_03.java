
public class C0724_03 {

	public static void main(String[] args) {
		// 로또 번호 생성
		//1. 1-45 배열 생성
		int[] num = new int[45];
		//2. 번호 입력
		for(int i = 0; i < 45; i++) {
			num[i] = i + 1;
		}
		//3. 번호 섞기
		int rnum = 0;
		int temp = 0; // 임시저장
		for(int i = 0; i < 300; i++) {
			rnum = (int)(Math.random() * 45);
			temp = num[0];
			num[0] = num[rnum];
			num[rnum] = temp;
		}
		//4. 번호 출력
		System.out.println("로또 번호");
		for(int i = 0; i<6; i++) {
			System.out.print(num[i]+" ");
		}
	}

}
