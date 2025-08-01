
public class C0728_12 {

	public static void main(String[] args) {
		// 객체선언
//		Cal c = new Cal();
//		
//		int a = 10;
//		int b = 5;
//		
//		System.out.println(c.add(a, b));
		
		// 같은 파일에 메소드가 있어도 객체 선언
//		C0728_12 c2 = new C0728_12();
//		int a = 10;
//		int b = 5;
//		c2.add(a, b);
		
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x : "+d.x);
		
		C0728_12.change(d);
		System.out.println("change : "+d.x);
		
	}
	
//	void add(int a, int b) {
//		System.out.println(a+b);
//	}
	
	// 클래스 메소드(선언 없이 사용 가능) - 
	static void change(Data d) {
		d.x = 1000;
		System.out.println("d.x : " + d.x); 
	}

}


class Data{
	int x;	// 인스턴스변수
	

}

