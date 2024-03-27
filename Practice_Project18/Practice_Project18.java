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