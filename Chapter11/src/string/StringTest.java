package string;

public class StringTest {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1==str2);
		
		String str3 = "abc";
		String str4 = "abc";
		System.out.println(str3==str4);
		
		String std1= new String("java");
		String std2= new String("android");
		System.out.println(System.identityHashCode(std1));
		std1 = std1.concat(std2);
		System.out.println(System.identityHashCode(std1));
		System.out.println(std1);
	}

}
