package b10_클래스;

/**
 * 
 * 자료형의 종류
 * 1. 일반자료형(int, double, char, boolean)
 * 2. 참조자료형(클래스, 배열)-> String, Phone, Student, Car, 배열[]
 *
 */

class Phone {
	private String company;
	private String model;
	private String color;
	private String newsAgency;
	private int d_ram;
	private String phoneCase;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
}
public class ClassEx {
	public static void main(String[] args) {
		Phone p = new Phone();
		Phone p2 = new Phone();
		
		// p.model = "iphone";
		// p2.model = "galaxy";
		
		p.setModel("iphone"); // 값을 세팅(대입)하는 것이기 때문에 리턴값이 없다.
		
		p.getModel(); 	// 단순히 클래스 내부의 변수 값을 가져오기 위한 것이기 때문에 
						// 리턴은 있지만 매개변수가 없다.
		
	}
}
