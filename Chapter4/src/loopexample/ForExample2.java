package loopexample;

public class ForExample2 {

	public static void main(String[] args) {

		/*int num=1;
		int sum=0;
		while(num<=10) {
			sum+=num;
			num++;			
		}
		System.out.println(sum);
		System.out.println(num);
		
		
		for(num=1, sum=0;num<=10;num++) {
			sum+=num;
		}
		
		System.out.println(sum);
		System.out.println(num);*/
		
		int dan;
		int times;
		for(dan=2;dan<9;dan++) {
			for(times=1;times<=9;times++) {
				//if(dan%2!=0)continue;
				if(times>dan)break;
				System.out.println(dan+"X"+times+"="+dan*times);
			}
			System.out.println();
		}
		
	}

}
