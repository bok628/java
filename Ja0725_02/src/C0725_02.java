
public class C0725_02 {

	public static void main(String[] args) {
		// 객체 선언
		Stuscore s = new Stuscore();
		s.name = "홍길동";
		s.kor = 100;
		s.eng = 100;
		s.math = 99;
		s.total = s.kor + s.eng + s.math;
		s.avg = s.total / 3.0;
		
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f",s.name,s.kor,s.eng,s.math,s.total,s.avg);

		
	}

}
