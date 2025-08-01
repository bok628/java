
public class C0725_02 {

	public static void main(String[] args) {
		
		String s = "홍길동";
		char s_1 = s.charAt(0);
		System.out.println(s_1);
		
		String a = "10";
		String b = new String("10");
		if(a.equals(b)) {
			System.out.println("같");
		}else {
			System.out.println("다름");
		}
		
	}

}
