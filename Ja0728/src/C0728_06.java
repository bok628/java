import java.util.Arrays;

public class C0728_06 {

	public static void main(String[] args) {
		// 다른 클래스 사용 방법 - 객체선언 후 사용
		// 카드 생성
		Card c = new Card();
		// spade heart diamond clover
		c.kind = "spade";
		c.number = 1;
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 2;
		Card c3 = new Card();
		c3.kind = "spade";
		c3.number = 3;
		
		
		// 카드 배열
		Card[] card = new Card[52];
		
		Card.width = 100;
		Card.height = 250;
		
		String[] shape = {"spade","heart","diamond","clover"};
		// 객체선언 후 값 입력
		for(int i = 0; i < card.length; i++) {
			card[i] = new Card();
			card[i].kind = shape[i/13];
			card[i].number = i%13 + 1;
		}
	
		System.out.println("width : "+card[0].width);
		System.out.println("width : "+card[1].width);
		
		
		// 출력
		for(int i = 0; i < card.length; i++) {
			System.out.println(card[i].kind + " " + card[i].number);			
		}
		
//		for(int i = 0; i < 13; i++) {
//			card[i] = new Card();
//			card[i].kind = shape[0];
//			card[i].number = i+1;
//			if( (i+1) % 13 == 0) {
//				i = 0;
//				card[i].number = i+1;
//				card[i].kind = shape[i+1];				
//			}
//			
//		}

	}

}
