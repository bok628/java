
public class C0724_15 {

	public static void main(String[] args) {
		int[] arr = new int[25];
		// 0 or 1로만 배열 구성
//		for(int i = 0; i<arr.length; i++) {
//			int rnum = (int)(Math.random()*1.9);
//			arr[i] = rnum; 
//		}
//
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
	// 0으로 배열을 이룬 뒤, 1 7개 넣기 & 랜덤섞기
	for ( int i = 0; i < 7; i++) {
		arr[i] = 1;
	}
	int rnum = 0;
	int temp = 0;
	
	for(int i = 0; i < 628; i++) {
		rnum = (int)(Math.random() * 25);
		temp = arr[0];
		arr[0] = arr[rnum];
		arr[rnum] = temp;
	}
	
	for(int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
}
	
	
	