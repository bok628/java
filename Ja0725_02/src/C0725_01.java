
public class C0725_01 {

	public static void main(String[] args) {
		// 변수 사용
		String str = new String("abc"); // 참조변수
		
		String str2 = "abc"; // 기본형(논리/문자/정수/실수형)
		int a = 10;
		
		// class 사용
		// 객체 선언 - 인스턴스 선언 
		Tv t = new Tv(); // t : 참조변수
		t.color = "white";
		t.channel = 7;
		t.channelUp();
		System.out.println("현재 채널 : "+t.channel);
		
		
		Tv t2 = new Tv();
		t2.color = "pink";
		t2.channel = 5;
		System.out.println("현재 채널 : "+t2.channel);
		
		Stuscore s = new Stuscore();
	}

}
