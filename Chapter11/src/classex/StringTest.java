package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person p = new Person();
		Class strClass = Class.forName("java.lang.String");
		Constructor[] cons = strClass.getConstructors();
		
		for (Constructor c :cons) {
			System.out.println(c);
		}
		
		Field[] fields = strClass.getFields();
		
		for (Field f :fields) {
			System.out.println(f);
		}
		
		Method[] methods = strClass.getMethods();
		
		for (Method m :methods) {
			System.out.println(m);
		}
				
		Class pClass4 = Class.forName("classex.Person");
		
		Person p2 = (Person)pClass4.newInstance();
		System.out.println(p);
		System.out.println(p2);
		
		
	}

}
