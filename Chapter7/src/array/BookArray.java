package array;

public class BookArray {
	public static void main(String[] args) {
		
		Book[] library=new Book[5];
		
		for(int i =0; i<library.length;i++) {
			System.out.println(library[i]);//객체자료형은 null값 저장
		}
		
		library[0]=new Book("태백산맥","조정래");
		library[1]=new Book("태백산맥1","조정래");
		library[2]=new Book("태백산맥2","조정래");
		library[3]=new Book("태백산맥3","조정래");
		library[4]=new Book("태백산맥4","조정래");
		
		for(int i =0; i<library.length;i++) {
			System.out.println(library[i]);// 배열 주소값 리턴
		}
		
		for(int i =0; i<library.length;i++) {
			library[i].showBookInfo(); // 배열 값 리턴
		}
	}

}
