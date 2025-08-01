
public class Cal {
	
	void powProcess(double input, int num, double[] number) {
		
		// 반올림
		number[0] = Math.round(input*Math.pow(10,num-1))/Math.pow(10,num-1);
		// 올림
		number[1] = Math.ceil(input*Math.pow(10,num-1))/Math.pow(10,num-1);
		// 버림
		number[2] = Math.floor(input*Math.pow(10,num-1))/Math.pow(10,num-1);
	}

	int add(int a,int b) {
		return a + b;
	}

	int minus(int a,int b) {
		return a - b;
	}
	
	int multi(int a,int b) {
		return a * b;
	}
	
	double divide(int a,int b) {
		return (double)a / b;
	}
}
