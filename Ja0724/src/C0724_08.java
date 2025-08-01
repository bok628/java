import java.util.Arrays;

public class C0724_08 {

	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9};
		int[] arr2 = new int[5];
		
		// 얕은 복사
//		arr2 = arr;
		
//		for(int i = 0; i < arr.length; i++) {
//			arr2[i] = arr[i];
//		}
		
		// 깊은 복사
		// (배열이름,첫시작,배열이름,첫시작,개수) arr를 복사하여 arr2에 넣기
		System.arraycopy(arr, 1, arr2, 2, 3);

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
	}

}
