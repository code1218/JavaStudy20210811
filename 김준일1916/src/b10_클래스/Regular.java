package b10_Ŭ����;

public class Regular {
	private boolean yaerCheck;

	public boolean isYaerCheck() {
		return yaerCheck;
	}

	public void setYaerCheck(int year, String schoolName) {
		this.yaerCheck = year > 2 && schoolName.equals("�ڸ��ƾ���Ƽ");
	}
	
}
