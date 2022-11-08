package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2693181401260258300L;
	
	String name;
	transient String title;
	
	
	public Person() {}
	public Person(String name, String title) {
		this.name=name;
		this.title=title;
	}
	
	public String tostString() {
		return name + "," + title;
	}
}
public class SerializationTest {

	public static void main(String[] args) throws ClassNotFoundException{

		Person pesonLee = new Person("Lee","Manger");
		try(FileOutputStream fos = new FileOutputStream("serial.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(pesonLee);
		}catch (Exception e) {
			System.out.println(e);
		}
		
		
		try(FileInputStream fis = new FileInputStream("serial.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Object obj = ois.readObject();
			if(obj instanceof Person) {
				Person p = (Person)obj;
				System.out.println(p);
			}
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
