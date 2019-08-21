
public class Average {
static //Write a method that receives two integers and returns the average of those two integers
	
	int numberOne;
	int numberTwo;
	
	static Average ave = new Average();
	public static void main(String[] args) {
		int number = averagenum(2,2);
		System.out.println(number);
		ave.annoying(annoy);
	}
	
	
	
	static int averagenum(int numberOne,int numberTwo) {
	int averagenum = numberOne + numberTwo;
	averagenum = averagenum/2;
	return averagenum;
	}
	
	static String annoy="annoy";
	
	void annoying(String annoy) {
		System.out.println(annoy + annoy + annoy);
	}
	
}


