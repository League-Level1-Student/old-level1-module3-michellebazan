///create two member variables in the class dog with getters and setters
public class Dog {

	
	
	String furColor;
	String furLength;
	
	public Dog (String furColor, String furLength) {
		this.furColor = furColor;
		this.furLength = furLength;

		}
	
	void setfurColor(String furColor) {
		this.furColor = furColor;
	}
	
	void setfurLength(String furLength) {
		this.furLength = furColor;
	}
	
	 String getfurColor(){
		return furColor;
	}
	
	String getfurLength() {
		return furLength;
	}



}
