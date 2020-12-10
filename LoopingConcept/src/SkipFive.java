
public class SkipFive {
	public static void main(String[] args) {
		
		System.out.println("Prog to illstrate continue while loop");
		
		//Skip printing all the multiples of 5
		
		int n = 5 , i = 1 ;
		while(i<=10) {
			if(i % 5 == 0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
		
		System.out.println("End of the prog ");
		
	}

}
