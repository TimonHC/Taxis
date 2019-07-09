import java.util.ArrayList;
import java.util.List;

public class Taxis {		
	
	public void printTaxis(List<Car> carsList) {			
		for (int i = 0; i<carsList.size(); i++) {
			 System.out.println(carsList.get(i).toCar());
		}
	}
}
	

