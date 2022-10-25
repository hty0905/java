package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		int[] numbers = new int[] {0,1,2};
		int[] numbers1 = {0,1,2};
		
		System.out.println(numbers.length);
		System.out.println(numbers1.length);
		
		int[] numbers2 = new int[3];
		numbers2[0]=1;
		numbers2[1]=2;
		numbers2[2]=3;
		
		for(int i=0;i<numbers2.length;i++) {
			System.out.println(numbers2[i]);
		}
		
		int[] studentIds = new int[10];// int 0으로 초기화
		for(int i=0;i<studentIds.length;i++) {
			System.out.println(studentIds[i]);
		}
		
		double[] studentIds1 = new double[10];// int 0.0으로 초기화
		for(int i=0;i<studentIds1.length;i++) {
			System.out.println(studentIds1[i]);
		}
		
		
		
	}

}
