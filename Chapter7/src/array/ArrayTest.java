package array;

public class ArrayTest {

	public static void main(String[] args) {
				
		double[] num = new double[5];
		int size=0;
		
		num[0]=10.0; size++;
		num[1]=20.0; size++;
		num[2]=30.0; size++;
		
		double total =0.0;
		double total1 =0.0;
		
		
		for(int i=0;i<size;i++) {//유효 요소만 출력
		//for(int i=0;i<num.length;i++) {// 0도 포함
			total +=num[i];
			total1 *=num[i];
			System.out.println(num[i]);
		}
		System.out.println(total);
		System.out.println(total1);
		
		
		
	}

}
