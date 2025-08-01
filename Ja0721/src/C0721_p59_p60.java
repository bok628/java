
public class C0721_p59_p60 {

	public static void main(String[] args) {
		// 변수 출력 방법
		byte b = 1;
		short s = 2;
		char c = 'A';
		
		int finger = 10;
		long big = 100000000000L;
	
		int octNum = 010;	// 8진수 10 => 10진수 8
		int hexNum = 0x10;  // 16진수 10 => 10진수 16
		int binNum = 0b10;	// 2진수 10 =>  10진수 2
		
		System.out.println("b\ts\tc\tfinger\tbig\toctNum\thexNum\tbinNum");
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.printf("%d\t%d\t%s\t%05d\t%d\t%d\t%d\t%d\n",b,s,c,finger,big,octNum,hexNum,binNum);
		
		// p.60
		double d = 1131654643e-9;
		double e = 1131654e-9;
		
		System.out.printf("d = %.14f \n",d);
		// 전체 14자리 중 소수 8자리까지 슬라이스
		System.out.printf("d = %14.8f \n",d);
		
		System.out.printf("e = %14.8f \n",e);
		
	}

}
