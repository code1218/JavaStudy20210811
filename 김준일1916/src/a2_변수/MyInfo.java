package a2_����;

public class MyInfo {

	public static void main(String[] args) {
		/** <�ڷ���>
		* ����(boolean) = true, false
		* boolean ������ = true;
		* boolean ������ = false;
		* 
		* 
		* ������(char) ĳ���� = a~z, �ѱ�(1���ڸ�)
		* char ������ = 'a';
		* char ������ = '��';
		* char ������ = '1';
		* char ������ = '$';
		* 
		* ���ڿ��ڷ���(String) ��Ʈ�� = "���ڿ��� ������ �� �ֽ��ϴ�."
		* String ������ = "�ȳ��ϼ���. �������Դϴ�.";
		* 
		* ������(int) Integer = 0 ~ 10 �������� ǥ��
		* int ������ = 100;
		* 
		* 
		* �Ǽ���(double) = 0.0 ~ 0.9999 �Ǽ�����(�Ҽ���) ǥ��
		* double ������ = 100.08776;
		* 
		*/
		
		// ���������� ������� �� �⵵�� �����ϴ� year����
		// ���������� ���� �����ϴ� month����
		// ���������� ���� �����ϴ� day����
		int year = 2021;
		int month = 8;
		int day = 11;
		
		// �̸��� ���������� ǥ�� �������� f,s,th
		char f = '��';
		char s = '��';
		char th = '��';
		String name = "������";
		// �÷� left, right ���� �Ǽ������� ���� ����
		double left = 0.5;
		double right = 0.7;
		// ���� ���� maleFemale������ ���� true, ���� false;
		boolean maleFemale = true;
		
		// �������: 0000�� 00�� 00��
		// �̸�: ������
		// �÷�(R): 0.5
		// �÷�(L): 0.7
		// ����: true
		
		System.out.print("�������: ");
		System.out.print(year);
		System.out.print("�� ");
		System.out.print(month);
		System.out.print("�� ");
		System.out.print(day);
		System.out.println("�� ");
		
		System.out.print("�̸�: ");
		System.out.print(f);
		System.out.print(s);
		System.out.println(th);
		
		System.out.print("�̸�: ");
		System.out.println(name);
		
		System.out.print("�÷�(R): ");
		System.out.println(right);
		System.out.print("�÷�(L): ");
		System.out.println(left);

		System.out.print("����: ");
		System.out.println(maleFemale);
	}

}
