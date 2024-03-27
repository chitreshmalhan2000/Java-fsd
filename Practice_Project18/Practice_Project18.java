package Practice_Project18;
public class Practice_Project18 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2020);
        ElectricCar electricCar = new ElectricCar("Tesla", "Model S", 2021, 100);
        
        System.out.println("Car: " + car.getMake() + " " + car.getModel() + ", Year: " + car.getYear());
        System.out.println("Electric Car: " + electricCar.getMake() + " " + electricCar.getModel() + ", Year: " + electricCar.getYear() + ", Battery Capacity: " + electricCar.getBatteryCapacity());

        Vehicle carVehicle = new CarVehicle();
        Vehicle electricCarVehicle = new ElectricCarVehicle();

        carVehicle.accelerate();
        electricCarVehicle.accelerate();
    }
}
//Encapsulation: Encapsulate the attributes of a car within a Car class
public class Car {
private String make;
private String model;
private int year;
public Car(String make, String model, int year) {
   this.make = make;
   this.model = model;
   this.year = year;
}

public String getMake() {
   return make;
}

public String getModel() {
   return model;
}

public int getYear() {
   return year;
}
}

//Concrete implementation of Vehicle for Car
public class CarVehicle extends Vehicle {
@Override
public void accelerate() {
   System.out.println("Car is accelerating.");
}
}

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
//Concrete implementation of Vehicle for ElectricCar
public class ElectricCarVehicle extends Vehicle {
@Override
public void accelerate() {
   System.out.println("Electric car is accelerating silently.");
}
}
//Abstraction: Create an abstract class Vehicle with abstract method accelerate
public abstract class Vehicle {
public abstract void accelerate();
}


