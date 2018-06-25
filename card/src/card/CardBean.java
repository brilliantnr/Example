package card;

public class CardBean {
	//pattern, number, width, height
	
	public int number, width, height;
	public String[]  pattern = {"Heart","Diamond","Spade","Clover"};
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String[] getPattern() {
		return pattern;
	}
	public void setPattern(String[] pattern) {
		this.pattern = pattern;
	}
	
	
	
	
	

	
	
}
