import java.util.Arrays;

public class C0724_02 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int num = 5;
		
		// 리스트 형태로 출력 - Arrays.toString(array)
		System.out.println(Arrays.toString(arr));
		
		// 배열 : 값 변경
		int[] arr2 = {0,0,0,0,0};
		arr2[0] = 100;
		arr2[1]=200;
		System.out.println(Arrays.toString(arr2));
		
		// 배열 복사
		// 얕은 복사 - 기존 배열(복사된 배열)의 요소값을 바꾸면 둘 다 바뀜.  
		arr2 = arr;
		System.out.println(Arrays.toString(arr2));
		
		// arr2는 arr의 주소를 띠고 있으므로 arr값 변경될 때 arr2에 반영
		arr[0] = 100;
		arr[1] = 200;
		
		arr2[2] = 300;
		
		System.out.println("arr : "+Arrays.toString(arr));
		System.out.println("arr2 : "+Arrays.toString(arr2));
		System.out.println("arr : "+arr);
		System.out.println("arr2 : "+arr2);
		
		
		
	}

}
