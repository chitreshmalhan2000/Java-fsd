package Practice_Project18;
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