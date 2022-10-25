package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		
		char[] alphabets = new char[26];
		char ch ='A'; // 65
		
		for(int i=0;i<alphabets.length;i++,ch++) {
			alphabets[i]=ch;//문자와 아스키 코드 저장가능
		}
		
		for(int i=0;i<alphabets.length;i++,ch++) {
			System.out.println(alphabets[i]);
		}	
		
		
	}

}
