package array;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] bookArray1=new Book[3];
		Book[] bookArray2=new Book[3];
		
		bookArray1[0]=new Book("태백산맥","조정래");
		bookArray1[1]=new Book("태백산맥1","조정래");
		bookArray1[2]=new Book("태백산맥2","조정래");
		
		bookArray2[0]=new Book();
		bookArray2[1]=new Book();
		bookArray2[2]=new Book();
		
		//System.arraycopy(bookArray1, 0, bookArray2, 0, 3);// 객체 배열 복사하기 1. 복사할 배열 2. 복사 시작할 위치 3. 붙여넣기할 배열 4. 복붙 시작 위치 5. 복붙 갯수
		
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[0].setAuthor("나무");
		bookArray1[0].setBookName("박완서");
		bookArray1[0].showBookInfo();// 주소값을 복사하기때문에 동일해짐
		bookArray2[0].showBookInfo();	
		
		for(int i=0;i<bookArray2.length;i++) {// 배열 값을 복사하기때문에 다름
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray1[i].showBookInfo();
			bookArray2[i].showBookInfo();
		}
		
		String[] strArr = {"Java", "Android","C"};
		
		for (int i=0;i<strArr.length;i++) {
			System.out.println(strArr[i]);
		}
		for(String s : strArr) {// 향상된 for문
			System.out.println(s);
		}
		
		int[] arr= {1,2,3,4,5};
		for(int num : arr) {// 향상된 for문
			System.out.println(num);
		}
		
	}

}
