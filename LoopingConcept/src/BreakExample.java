
public class BreakExample {

	public static void main(String[] args) {
		System.out.println("Prog to break");
		
		// found 5
		
		for(int i=1; i<=10 ; i++) {
			if(i == 5) {
				break;
			}
			System.out.println("i = "+ i);
		}
		System.out.println("==================");
		//continue  skip execute 6
		for(int i = 1 ; i<=10 ; i++) {
			if(i == 6) {
				continue;
			}
			System.out.println("i = "+ i);
		}
		
	}

}
