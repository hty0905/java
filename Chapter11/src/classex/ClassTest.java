package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Person person = new Person();
		
		Class pClass1 =person.getClass();
		
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		
		System.out.println(pClass2.getName());
		
		
		Class pClass3 = Class.forName("classex.Person");//동적 로딩, 실행될때 존재여부 판단
		System.out.println(pClass3.getName());
	}

}
