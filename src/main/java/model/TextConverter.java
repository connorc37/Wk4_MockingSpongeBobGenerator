package model;

/**
 * @author Corey Connor - cconnor3
 * CIS175 - Spring 2022
 * Feb 10, 2022
 */

public class TextConverter {
	
	String normalText;	
	String mockingText;
	
	public TextConverter() {
		super();
	}

	public TextConverter(String normalText) {
		super();
		this.normalText = normalText;
		setMockingText(normalText);
	}

	public String getNormalText() {
		return normalText;
	}

	public void setNormalText(String normalText) {
		this.normalText = normalText;
	}
	
	public String getMockingText() {
		return mockingText;
	}

	public void setMockingText(String mockingText) {
		String input = mockingText.toLowerCase();
		char[] charArray = input.toCharArray();
		
		for (int i = 0; i < input.length(); i+=2) {
			charArray[i] = Character.toUpperCase(charArray[i]);
		}
		
		this.mockingText = new String(charArray);
	}

	@Override
	public String toString() {
		return "TextConverter [normalText=" + normalText + ", mockingText=" + mockingText + "]";
	}
	
}
