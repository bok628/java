
public class Tv {
	String color; // 변수
	boolean power;// 변수
	int channel;  // 변수
	
	
	// 메소드(함수) 
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
}
