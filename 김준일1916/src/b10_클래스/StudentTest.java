package b10_Ŭ����;

public class StudentTest {

	public static void main(String[] args) {
		Student kim = new Student("������", 4);
		Student lee = new Student();
		
		//kim.name = "������"; //   .�� �ش� �޸� �ּҰ��� �����Ѵٶ�� �Ѵ�.
		
		kim.showInfo();
		
		Integer i = new Integer(100);
		
		System.out.println(kim.hashCode());
		System.out.println(i.hashCode());
	}

}
