public class C0721_12 {

	public static void main(String[] args) {
		// 5자리 출력
		System.out.printf("[%5d] \n",12);
		// 5자리 출력(공백은 0으로)
		System.out.printf("[%05d] \n",12);
		
		int a = 5;
		System.out.println("a : "+ (a++));
		System.out.println("a : "+ (++a));

		char ch = 65; //A
		System.out.println(ch);
		
		System.out.println("ch+1 : "+ (char)(ch+1));
		System.out.println("ch : "+ (++ch));
	}

}
