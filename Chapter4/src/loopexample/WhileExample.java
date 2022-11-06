package loopexample;

public class WhileExample {

	public static void main(String[] args) {

		int num =11;
		int sum =0;
		
		do {
			sum+=num;
			num+=1;
			System.out.println(num);
		}
		while(num<=10);			
		System.out.println(sum);
	}

}
