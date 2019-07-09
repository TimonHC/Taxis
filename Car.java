import java.util.Comparator;

public class Car{
	
	int cost;
	String grade;
	Integer fuelConsumption;
	int maxSpeed;
	
	String mark;
	String allGrades[] = {"A", "B", "C", "D"};
	
	Car(String mark, int cost, int fuelConsumption, int grade, int maxSpeed){
		this.mark = mark;
		this.cost = cost;
		this.fuelConsumption = fuelConsumption;
		this.grade= allGrades[grade];
		this.maxSpeed = maxSpeed;
	}
	Car(String mark){
		this.mark = mark;		
	}
	
	public String toCar() {
		return "mark " + this.mark + " cost " + this.cost + " Fuel Consumption " 
		+ this.fuelConsumption + " Grade " + this.grade + " Max speed " + this.maxSpeed;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public Integer getFuelConsumption() {
		return fuelConsumption;
	}
	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

Comparator<Car> byFuelConsumption = 
(Car car1, Car car2)->car1.getFuelConsumption().compareTo(car2.getFuelConsumption());

}

