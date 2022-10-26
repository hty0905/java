package array;

public class TwoDimensionArray {

	public static void main(String[] args) {

		int[][] arr= new int[2][3];
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		
		int[][] arr1= {{1,2,3},{4,5,6}};
		System.out.println(arr1.length);
		System.out.println(arr1[0].length);
		System.out.println(arr1[1].length);
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.println(arr1[i][j]);
			}
		}
		
		char[][] alphabets = new char[13][2];
		
		int k=65;
		for(int i=0;i<alphabets.length;i++) {
			for(int j=0;j<alphabets[i].length;j++) {
				alphabets[i][j]=(char)k;
				k++;
			}
		}
		
		for(int i=0;i<alphabets.length;i++) {
			for(int j=0;j<alphabets[i].length;j++) {
				System.out.println(alphabets[i][j]);
			}
		}
		
	}

}
