
public class AirthmeticOperationsTester {
	public static void main(String[] args) {
		System.out.println("Begin of the prog ");
		
		AirthmeticOperations operation = new AirthmeticOperations();
		
		int a ; //local variable 
		int b = 20 ;
		
		a = 10;
		int result = operation.addition(a, b);  //method call
		System.out.println("Result of a: "+ a + " b: " + b + " is "+ result);
		
		int p = 12 , q= 81 , r= 9;
		int result2 = operation.addition(p, q, r);
		System.out.println("Result of adding p: "+ p + " q: "+ q + " r: " + r + " is: "+ result2);
		
		double result3 = operation.addition(15.00, 75.23);
		System.out.println("Result of 15.00 + 75.23 : "+ result3);
		
		operation.addition(14.00, 7);  //casting 
		
		a = 65;
		
		
		System.out.println("End of the prog");
	}

}
