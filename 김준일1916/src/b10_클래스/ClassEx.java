package b10_Ŭ����;

/**
 * 
 * �ڷ����� ����
 * 1. �Ϲ��ڷ���(int, double, char, boolean)
 * 2. �����ڷ���(Ŭ����, �迭)-> String, Phone, Student, Car, �迭[]
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
		
		p.setModel("iphone"); // ���� ����(����)�ϴ� ���̱� ������ ���ϰ��� ����.
		
		p.getModel(); 	// �ܼ��� Ŭ���� ������ ���� ���� �������� ���� ���̱� ������ 
						// ������ ������ �Ű������� ����.
		
	}
}
