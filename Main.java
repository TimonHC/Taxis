import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number of cars:");		
		int carCount = scanner.nextInt();	
		System.out.println("enter speed diapason (min/max)");
		int minDiapasonOfSpeed = scanner.nextInt();
		int maxDiapasonOfSpeed = scanner.nextInt();
		Taxis taxis = new Taxis();
		List<Car> carsList = new ArrayList<Car>();
		System.out.println("Enter cars characteristics:");
		for (int i = 0; i<=carCount-1; i++) {		
					
			System.out.println("Enter mark");
		    String mark = scanner.next();
		    		
		    System.out.println("Enter cost");
		    int cost = scanner.nextInt();
		   		    
		    System.out.println("Enter fuel consumption");
		    int fuelConsumption = scanner.nextInt();
		 		    
		    System.out.println("Choose grade 1A,2B,3C,4D");
		    int grade = scanner.nextInt()-1;
		  		    
		    System.out.println("Enter max Speed");
		    int maxSpeed = scanner.nextInt();		    
		    
		    carsList.add(new Car(mark, cost, fuelConsumption, grade, maxSpeed));	
		   
		}		
		//taxis.printTaxis(carsList);	
		scanner.close();				 
		
		Collections.sort(carsList, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getFuelConsumption() - car2.getFuelConsumption();
            }
        });
		System.out.println("sorted by fuel consumption:");
		taxis.printTaxis(carsList);
		System.out.println("car corresponding to the specified speed range:");
		for (int i = 0; i<carsList.size(); i++) {
			if(carsList.get(i).getMaxSpeed() > minDiapasonOfSpeed 
					&& carsList.get(i).getMaxSpeed() < maxDiapasonOfSpeed) {
				System.out.println(carsList.get(i).toCar());
			}
		}
    }		
}

