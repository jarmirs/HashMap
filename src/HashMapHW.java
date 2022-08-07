import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//The model is the Key, the make is the Value.

//Ask the customer what car (model) they are looking for,

//use the HashMap to determine if you have that vehicle, and what make it is.

//(e.g., "Oh, you're looking for a Civic? Our Honda selection is right over here...")
public class HashMapHW {
	public static void main (String [] arg) {
		HashMap<String, String> car = new HashMap<>();
		car.put("Camry", "Toyota");
		car.put("Wrangler", "Jeep");
		car.put("Altima", "Nissan");
		car.put("corolla", "Toyota");
		car.put("Civic", "Honda");
		System.out.println(car);
		Scanner Input=new Scanner(System.in);
		System.out.println("What car are you looking for?");
		String model= Input.nextLine();
		System.out.println(model);
		
		for (Map.Entry<String, String>vehicle:car.entrySet()) {
			//System.out.println(vehicle);
			String userModel=vehicle.getKey();
			if (model.equals(userModel)) {
				System.out.println( "We have that car");
			System.out.printf("Oh ,you're looking for a %s? Our %s selections are here", model, vehicle.getValue());
			} 
			}
			
		}
}
