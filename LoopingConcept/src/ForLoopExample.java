
public class ForLoopExample {
	
	public static void main(String[] args) {
		
		System.out.println("Prog to print whole number between 0 to 10" ); 
		
		for(int i = 0; i <= 10 ; i++) {  // post increment
			System.out.println(i);
		}
		
		// i =0 ; 0<=10 ;i++
		// 1 <= 10  i++
		// 2 <= 10  i++
		//...
		// 10 <= 10 i++
		// 11 <= 10 false
		
		System.out.println("Printing wholenums in decending order from 10 till 0");
		// 10 9 8 7 6 ... 0
		for(int i =10; i >= 0 ; i--) {
			System.out.println(i);
		}
		
//		for(;;)
//			System.out.println("*");
		
		for(int i =0; i <= 10 ; i++) 
			System.out.println("*");
			
		System.out.println("End of the prog");
	}

}

//0
//1
//2 ...
//10