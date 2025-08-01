
public class C0722_04 {

	public static void main(String[] args) {
		// slice
		double pi = 3.141592;	
		double s_pi = (int)(pi * 1000.0) / 1000.0; // int(3141.592) / 1000
		
		double p = 123.5468777; //소수점 4자리까지
		double s_p = (int)(p*10000)/10000.0;
				
		System.out.println(s_p);
		
		// round, floor, ceil
		double p2 = p*100000;
		double d = Math.floor(p2);
		d = d / 100000.0;
		System.out.println(d);
		
		// 소수점 5자리에서 반올림해서 4자리까지 출력
		double num = Math.round(p*10000)/10000.0;
		System.out.println(num);
		
		// 소수점 3자리에서 올림하여 2자리까지 출력
		double c_p = Math.ceil(pi*100)/100.0;
		System.out.println(c_p);
		
	}

}
