
public class C0721_06 {

	public static void main(String[] args) {
		// overflow : 128 이상일 때 -128부터 출력됨 ex) 128 => -128, 130 => -132,  -129 => 127 ...
		byte b = 127;
		System.out.println("b : "+b);
		b = (byte) (b + (byte)10);			// 127 + 10 < byte
		System.out.println("b + 10 : "+b);  // -119 출력
		
	}

}
