package ifexample;

public class IfExample3 {

	public static void main(String[] args) {

		int age=9;
		int charge=0;
		if(age<8) {
			charge=1000;
			System.out.println("미취학아동");
		}
		if(age<14) {
			charge=2000;
			System.out.println("초딩");
		}
		if(age<20) {
			charge=2500;
			System.out.println("중고딩");
		}
		else  {
			charge=3000;
			System.out.println("성인");
		}
		
		System.out.println("입장료는"+charge+"입니다");
	}

}
