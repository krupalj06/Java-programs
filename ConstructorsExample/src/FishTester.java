
public class FishTester {
	
	public static void main(String[] args) {
		
		Fish goldfish = new Fish();
		
		System.out.println("Breed: "+ goldfish.breed);
		System.out.println("Life span: "+ goldfish.ageInDays);
		System.out.println("Color: "+ goldfish.color);
		System.out.println("Cost: "+ goldfish.cost);
		System.out.println("Size: " + goldfish.size);
		
		System.out.println("=========");
		Fish shark = new Fish("Shark", "Grey", "Medium", 1000, 120.00);

		System.out.println("Breed: "+ shark.breed);
		System.out.println("Life span: "+ shark.ageInDays);
		System.out.println("Color: "+ shark.color);
		System.out.println("Cost: "+ shark.cost);
		System.out.println("Size: " + shark.size);
		
		System.out.println("=========");
		
		Fish starFish = new Fish("Star Fish", "Red", 1500);
		System.out.println("Breed: "+ starFish.breed);
		System.out.println("Life span: "+ starFish.ageInDays);
		System.out.println("Color: "+ starFish.color);
		System.out.println("Cost: "+ starFish.cost);  //0.0
		System.out.println("Size: " + starFish.size);  // null
		System.out.println("=========");
		
		starFish.cost = 800.00;
		starFish.size = "small";
		
		System.out.println("Cost: "+ starFish.cost);  
		System.out.println("Size: " + starFish.size); 
	}

}
