import java.util.Arrays;
import java.util.Scanner;

public class Process {
	
	Scanner scan = new Scanner(System.in);
	
	void Lotto(int[] myNo,int[] lotto,int[] okNo) {
		int count = 0;
		for(int i = 0; i < myNo.length; i++) {
			System.out.println("번호 입력(1-45)");
			myNo[i] = scan.nextInt();
		}
		
		int[] random = new int[45];
		for(int i = 0; i < random.length; i++) {
			random[i] = i + 1 ;
		}
		int rnum = 0;
		int temp = 0;
		for(int i = 0; i < 628; i++) {
			rnum = (int)(Math.random() * 45);
			temp = random[0];
			random[0] = random[rnum];
			random[rnum] = temp;
		}
		
		System.arraycopy(random, 0, lotto, 0, 6);
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(myNo[i] == lotto[j]) {
					okNo[count] = myNo[i];
					count += 1;
				}
			}
		}
		
		System.out.println("입력번호 : "+Arrays.toString(myNo));
		System.out.println("로또번호 : "+Arrays.toString(lotto));
		System.out.println("맞춘 개수 : "+count);
		System.out.print("맞춘 번호 : ");
		for(int i = 0; i < count; i++) {
			System.out.print(okNo[i] + " ");
		}
		
	}
	
	// return 1개만 가능
	void resultProcess(int a, int b, double[] result) {
		result[0] = a+b;
		result[1] = a-b;
		result[2] = a*b;
		result[3] = a/b;
		
	}
	
	void numProcess() {
		
		int[] input = new int[10];
		int answer = (int)(Math.random() * 100) + 1;
		int i = 0;
		while(i < 10) {
			
			System.out.println("숫자 맞추기");
			System.out.println("--------");
			System.out.println("숫자 입력(1-100)");
			input[i] = scan.nextInt();
			if(answer>input[i]) {
				System.out.println("입력한 값이 더 작습니다.");
			}else if(answer < input[i]) {
				System.out.println("입력한 값이 더 큽니다.");
			}else {
				System.out.println("정답입니다.");
				break;
			}
			
			i++;
		}//while
		
		System.out.println("정답 출력 : "+answer);
		System.out.println("입력번호 : " + Arrays.toString(input));
	}
	
	
	void multiple(int n) {

		for(int i = 2; i <= n; i++) {
			System.out.printf("[ %d단 ]\n",i);
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\t",i,j,i*j);
			}
			System.out.println();
		}
	}
}
