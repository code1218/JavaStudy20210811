package b10_클래스;

public class Regular {
	private boolean yaerCheck;

	public boolean isYaerCheck() {
		return yaerCheck;
	}

	public void setYaerCheck(int year, String schoolName) {
		this.yaerCheck = year > 2 && schoolName.equals("코리아아이티");
	}
	
}
