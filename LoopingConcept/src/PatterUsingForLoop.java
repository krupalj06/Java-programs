
public class PatterUsingForLoop {
	public static void main(String[] args) {
		int count = 1;
		for(int i=0 ; i<=2 ;i++){
		    for(int j = 0; j<=2; j++ ){
				System.out.print(count+ "  ");
				count++;
			}
		    System.out.println();
		}
		
		System.out.println("Pattern increment");
		
		for(int i= 1 ; i <= 5; i++ ) {   // i=1 i<=5
			for(int j= 1 ; j <= i; j++ ) {  // j=1 ; j <=1 // j=2 j<=1
				System.out.print("* ");   //*
			}
			System.out.println();
		}
		
		System.out.println("Pattern decrement");
		int n = 10;
		for(int i= n ; i >= 1; i-- ) {  
			for(int j= 1 ; j <= i; j++ ) {  
				System.out.print("* ");   
			}
			System.out.println();
		}
		
	}
}
// i = 2 i<=5 


/*
 * 
 * *
 * * *
 * * * *
 * * * * *
  
  
  
 * * * * *
 * * * * 
 * * *
 * *
 *  
 
 
 */

