package Practice_Project18;
//Inheritance: Create a subclass ElectricCar that inherits from Car
public class ElectricCar extends Car {
 public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

private int batteryCapacity;
 public ElectricCar(String make, String model, int year, int batteryCapacity) {
     super(make, model, year);
     this.batteryCapacity = batteryCapacity;
 }

 // Polymorphism: Override the getYear method to add extra functionality
 @Override
 public int getYear() {
     int currentYear = super.getYear();
     return currentYear - 5; // Simulating depreciation
 }
}
