
public class C0728_02 {

	public static void main(String[] args) {
		// TV2 객체 생성 후 불러오기
		TV2 t = new TV2();
		
		t.color = "pink";
		t.channel = 7;
		
		System.out.println(t.color);
		System.out.println(t.channel);
		
		TV2 t2 = new TV2();
		
		t2.color = "white";
		t2.channel = 5;
		
		System.out.println(t2.color + t2.channel);
		
		t2 = t;
		
		System.out.println(t2.channel); // 7
		t.channel = 1;
		System.out.println(t.channel); // 1
		
	}

}
