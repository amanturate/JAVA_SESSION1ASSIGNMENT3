
public class ASSIGNMENT3 {

	public static void main(String[] args) {
		
		int num1 = 20;
		int num2 = 6;
		
		System.out.println("Before Swapping Num1 is " + num1 + " and num2 is " + num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("After Swapping Num1 is " + num1 + " and num2 is " + num2);
	}
}
