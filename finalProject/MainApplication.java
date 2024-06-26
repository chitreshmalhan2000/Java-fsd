package finalProject;
import java.util.*;
public class MainApplication implements UserInterface {
    private StorageManager storageManager;
    private TaxCalculator taxCalculator;
    private Scanner scanner;
    double pid=1;

    public MainApplication() {
        storageManager = new StorageManager();
        taxCalculator = new TaxCalculator();
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
    	try 
    	{
        MainApplication app = new MainApplication();
        app.run();
    	}
    	catch(Exception e)
    	{ 
    		System.out.println("Exception is there.");
    	}
    }

    public void run() {
        displayWelcomeScreen();
        boolean exit = false;
        while (!exit) {
            displayMainMenu();
            int choice = getUserChoice();
            switch (choice) {
                case 1:
                    handlePropertyTax();
                    break;
                case 2:
                    handleVehicleTax();
                    break;
                case 3:
                    displayTaxDetails();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting application...");
                    break;
                default:
                    displayErrorMessage("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private void handlePropertyTax() {
        boolean backToMenu = false;
        while (!backToMenu) {
            System.out.println("1. ADD PROPERTIES DETAILS");
            System.out.println("2. CALCULATE PROPERTY TAX");
            System.out.println("3. DISPLAY ALL PROPERTIES");
            System.out.println("4. BACK TO MAIN MENU");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addProperty();
                    break;
                case 2:
                    calculatePropertyTax(scanner,storageManager);
                    break;
                case 3:
                    displayAllProperties();
                    break;
                case 4:
                    backToMenu = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
    private void handleVehicleTax() {
        boolean backToMenu = false;
        while (!backToMenu) {
            System.out.println("1. ADD VEHICLE DETAILS");
            System.out.println("2. CALCULATE VEHICLE TAX");
            System.out.println("3. DISPLAY ALL VEHICLES");
            System.out.println("4. BACK TO MAIN MENU");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addVehicle();
                    break;
                case 2:
                    calculateVehicleTax(scanner,storageManager);
                    break;
                case 3:
                    displayAllVehicles();
                    break;
                case 4:
                    backToMenu = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }

    private void calculateVehicleTax(Scanner scanner, StorageManager storagemanager) {
    	  List<Vehicle> vehicles = storageManager.getVehicles();
    	  System.out.println("==============================================================================================================");
          System.out.println("REGISTRATION NO.\tBRAND\tMAX. VELOCITY\tNO. OF SEATS\tVEHICLE TYPE\tPURCHASE COST\tVEHICLE TAX");
          System.out.println("==============================================================================================================");
          for (Vehicle vehicle : vehicles) {
              System.out.print(vehicle.getRegistrationNumber() + "\t\t\t");
              System.out.print(vehicle.getBrand() + "\t\t");
              System.out.print(vehicle.getMaxVelocity() + "\t\t");
              System.out.print(vehicle.getPassengerCount() + "\t\t");
              System.out.print(vehicle.getVehicleType() + "\t");
              System.out.print(vehicle.getPurchaseCost() + "\t\t");
              System.out.println(vehicle.calculateVehicleTax());
          }
          System.out.println("==============================================================================================================");
          System.out.println("Enter the Registration No. of Vehicle to calculate the tax - ");
          String num;
          num=scanner.next();
          for (Vehicle vehicle : vehicles) {
              if (vehicle.getRegistrationNumber().equals(num)) {
                  System.out.println("VEHICLE TAX FOR REGISTRATION NO - " + num + " IS " + vehicle.calculateVehicleTax());
                  return;
              }
          }
          System.out.println("Vehicle not found with Registration No. : " + num);
          
    }

    private void displayAllVehicles() {
        List<Vehicle> vehicles = storageManager.getVehicles();
        System.out.println("==============================================================================================================");
        System.out.println("REGISTRATION NO.\tBRAND\tMAX. VELOCITY\tNO. OF SEATS\tVEHICLE TYPE\tPURCHASE COST\tVEHICLE TAX");
        System.out.println("==============================================================================================================");
        for (Vehicle vehicle : vehicles) {
            System.out.print(vehicle.getRegistrationNumber() + "\t\t\t");
            System.out.print(vehicle.getBrand() + "\t\t");
            System.out.print(vehicle.getMaxVelocity() + "\t\t");
            System.out.print(vehicle.getPassengerCount() + "\t\t");
            System.out.print(vehicle.getVehicleType() + "\t");
            System.out.print(vehicle.getPurchaseCost() + "\t\t");
            System.out.println(vehicle.calculateVehicleTax());
        }
        System.out.println("==============================================================================================================");
        }
    
  
    private  void calculatePropertyTax(Scanner scanner, StorageManager storagemanager) {
    	System.out.println("=============================================================================");
    	System.out.println("ID\tBUILT-UP AREA\tBASE PRICE\tAGE (YEARS)\tIN CITY\tPROPERTY TAX");
    	System.out.println("=============================================================================");
    	List<Property> properties = storagemanager.getProperties();
        for (Property property : properties) {
            System.out.print(property.getPropertyId() + "\t");
            System.out.print(property.getBuiltUpArea() + "\t\t");
            System.out.print(property.getBaseValue() + "\t\t");
            System.out.print(property.getAgeOfConstruction() + "\t\t");
            if(property.isInCity())
            System.out.print("Y" + "\t");
            else
            System.out.print("N" +"\t");
            System.out.println(property.calculatePropertyTax());
        }
        System.out.println("=============================================================================");
        System.out.print("ENTER THE PROPERTY ID TO CALCULATE THE TAX: ");
        int propertyId = scanner.nextInt();
        for (Property property : properties) {
            if (property.getPropertyId() == propertyId) {
                System.out.println("PROPERTY TAX FOR PROPERTY ID " + propertyId + " IS " + property.calculatePropertyTax());
                return;
            }
        }
        System.out.println("Property not found with ID: " + propertyId);
    }

    private void displayAllProperties() {
        List<Property> properties = storageManager.getProperties();
        System.out.println("=============================================================================");
        System.out.println("ID\tBUILT-UP AREA\tBASE PRICE\tAGE (YEARS)\tIN CITY\tPROPERTY TAX");
        System.out.println("=============================================================================");
        for (Property property : properties) {
            System.out.print(property.getPropertyId() + "\t");
            System.out.print(property.getBuiltUpArea() + "\t\t");
            System.out.print(property.getBaseValue() + "\t\t");
            System.out.print(property.getAgeOfConstruction() + "\t\t");
            if(property.isInCity())
            System.out.print("Y" + "\t");
            else
            System.out.print("N" +"\t");
            System.out.println(property.calculatePropertyTax());
        }
        System.out.println("=============================================================================");
    }

    private void addVehicle() {
        System.out.println("\nENTER VEHICLE DETAILS:");

        String registrationNumber = null;
        try {
            System.out.print("ENTER THE VEHICLE REGISTRATION NUMBER: ");
            registrationNumber = scanner.next();
            if (!registrationNumber.matches("^0*[1-9]\\d{3}$")) {
                throw new IllegalArgumentException("Error: Registration number must be a 4-digit positive number.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.print("ENTER THE BRAND OF THE VEHICLE: ");
        String brand = scanner.next();

        double maxVelocity = 0;
        try {
            System.out.print("ENTER THE MAXIMUM VELOCITY OF THE VEHICLE (KMPH): ");
            maxVelocity = scanner.nextDouble();
            if (maxVelocity < 120 || maxVelocity > 300) {
                throw new IllegalArgumentException("Error: Maximum velocity must be between 120 and 300 KMPH.");
            }
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
            return;
        }

        int passengerCount = 0;
        try {
            System.out.print("ENTER CAPACITY(NUMBER OF SEATS) OF THE VEHICLE: ");
            passengerCount = scanner.nextInt();
            if (passengerCount < 2 || passengerCount > 50) {
                throw new IllegalArgumentException("Error: Passenger count must be between 2 and 50.");
            }
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
            return;
        }

        String typeOfVehicle = null;
        try {
            System.out.println("CHOOSE THE TYPE OF THE VEHICLE:");
            System.out.println("1. PETROL DRIVEN");
            System.out.println("2. DIESEL DRIVEN");
            System.out.println("3. CNG/LPG DRIVEN");
            int vehicleType = scanner.nextInt();
            switch (vehicleType) {
                case 1:
                    typeOfVehicle = "Petrol";
                    break;
                case 2:
                    typeOfVehicle = "Diesel";
                    break;
                case 3:
                    typeOfVehicle = "CNG/LPG";
                    break;
                default:
                    throw new IllegalArgumentException("Error: Invalid input. Please select a valid vehicle type.");
            }
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
            return;
        }

        double purchaseCost = 0;
        try {
            System.out.print("ENTER THE PURCHASE COST OF THE VEHICLE: ");
            purchaseCost = scanner.nextDouble();
            if (purchaseCost < 50000 || purchaseCost > 1000000) {
                throw new IllegalArgumentException("Error: Purchase cost must be between INR 50000 and INR 1000000.");
            }
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
            return;
        }

        Vehicle vehicle = new Vehicle(registrationNumber, brand, purchaseCost, maxVelocity, passengerCount, typeOfVehicle);
        storageManager.addVehicle(vehicle);
        System.out.println("VEHICLE ADDED SUCCESSFULLY!");
    }

    private void displayTaxDetails() {
        List<Property> properties = storageManager.getProperties();
        List<Vehicle> vehicles = storageManager.getVehicles();

        double totalPropertyTax = taxCalculator.calculateTotalPropertyTax(properties);
        double totalVehicleTax = taxCalculator.calculateTotalVehicleTax(vehicles);
        
        
        double totalTax = totalPropertyTax + totalVehicleTax;
        System.out.println("+ ----------------------------------------------------- +");
        System.out.println("|  SR.NO.\tPARTICULAR\tQUANTITY\tTAX\t|");
        System.out.println("+ ----------------------------------------------------- +");
        System.out.println("|\t1 \t PROPERTIES \t\t"+properties.size()+"\t"+totalPropertyTax);
        System.out.println("|\t2 \t VEHICLES \t\t"+vehicles.size()+"\t"+totalVehicleTax);
        System.out.println("+ ----------------------------------------------------- +");
        System.out.print("|  TOTAL");
        System.out.printf("\t\t\t\t%d\t%.2f\n", properties.size() + vehicles.size(), totalTax);
        System.out.println("+ ----------------------------------------------------- +");
    }
    @Override
    public void displayWelcomeScreen() {
    	System.out.println("+----------------------------------+");
        System.out.println("|  WELCOME TO TAX CALCULATION APP  |");
        System.out.println("+----------------------------------+");
        System.out.println("PLEASE LOGIN TO CONTINUE -");
        String usr,pass;
        Scanner sc=new Scanner(System.in);
        System.out.print("USERNAME -");
        usr=sc.nextLine();
        System.out.print("PASSWORD -");
        pass=sc.nextLine();
    }
         @Override
    public void displayMainMenu() {
        System.out.println("\nMain Menu:");
        System.out.println("1. PROPERTY TAX");
        System.out.println("2. VEHICLE TAX");
        System.out.println("3. TOTAL");
        System.out.println("4. EXIT");
    }

    @Override
    public int getUserChoice() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    @Override
    public void displayErrorMessage(String message) {
        System.out.println("Error: " + message);
    }
    private void addProperty() {
        System.out.println("\nENTER PROPERTY DETAILS:");

        double baseValue = 0;
        do {
            try {
                System.out.print("ENTER THE BASE VALUE OF THE LAND: ");
                baseValue = scanner.nextDouble();
                if (baseValue <= 0) {
                    throw new IllegalArgumentException("Error: Base value must be a positive non-zero number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter a valid number.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (baseValue <= 0);

        double builtUpArea = 0;
        do {
            try {
                System.out.print("ENTER THE BUILT-UP AREA OF THE LAND: ");
                builtUpArea = scanner.nextDouble();
                if (builtUpArea <= 0) {
                    throw new IllegalArgumentException("Error: Built-up area must be a positive non-zero number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter a valid number.");
                scanner.next(); // clear the scanner buffer
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (builtUpArea <= 0);

        int ageOfConstruction = 0;
        do {
            try {
                System.out.print("ENTER THE AGE OF CONSTRUCTION IN YEARS: ");
                ageOfConstruction = scanner.nextInt();
                if (ageOfConstruction <= 0) {
                    throw new IllegalArgumentException("Error: Age of construction must be a positive non-zero number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter a valid number.");
                scanner.next(); // clear the scanner buffer
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (ageOfConstruction <= 0);

        boolean isInCity = false;
        int flag=0;
        do {
            try {
                System.out.print("IS THE LAND LOCATED IN THE MAIN CITY? (Y/N): ");
                String input = scanner.next().trim().toUpperCase();
                if (input.equals("Y")) {
                    isInCity = true;
                    flag=1;
                } else if (input.equals("N")) {
                    isInCity = false;
                    flag=1;
                } else {
                    throw new IllegalArgumentException("Error: Invalid input. Please enter Y for Yes or N for No.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (flag!=1);

        Property property = new Property(pid, baseValue, builtUpArea, ageOfConstruction, isInCity);
        storageManager.addProperty(property);
        pid++;
        System.out.println("PROPERTY ADDED SUCCESSFULLY!");
    }
}




 interface UserInterface {
    void displayWelcomeScreen();
    void displayMainMenu();
    int getUserChoice();
    void displayErrorMessage(String message);
}

 class StorageManager {
    private List<Property> properties;
    private List<Vehicle> vehicles;

    public StorageManager() {
        properties = new ArrayList<>();
        vehicles = new ArrayList<>();
    }

    public void addProperty(Property property) {
        properties.add(property);
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<Property> getProperties() {
        return properties;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}

 class TaxCalculator {
    public double calculateTotalPropertyTax(List<Property> properties) {
        double totalPropertyTax = 0.0;
        for (Property property : properties) {
            totalPropertyTax += property.calculatePropertyTax();
        }
        return totalPropertyTax;
    }

    public double calculateTotalVehicleTax(List<Vehicle> vehicles) {
        double totalVehicleTax = 0.0;
        for (Vehicle vehicle : vehicles) {
            totalVehicleTax += vehicle.calculateVehicleTax();
        }
        return totalVehicleTax;
    }
}


class Property {
    private double baseValue;
    private double builtUpArea;
    private double ageOfConstruction;
    private boolean isInCity;
    double propertyId;
    public Property() {
    	super();
    }  

    public Property(double propertyId,double baseValue, double builtUpArea, double ageOfConstruction, boolean isInCity) {
        this.propertyId = propertyId;
    	this.baseValue = baseValue;
        this.builtUpArea = builtUpArea;
        this.ageOfConstruction = ageOfConstruction;
        this.isInCity = isInCity;
    }


	public double getPropertyId() {
		return propertyId;
	}


	public void setPropertyId(double propertyId) {
		this.propertyId = propertyId;
	}


	public double getBaseValue() {
		return baseValue;
	}


	public void setBaseValue(double baseValue) {
		this.baseValue = baseValue;
	}


	public double getBuiltUpArea() {
		return builtUpArea;
	}


	public void setBuiltUpArea(double builtUpArea) {
		this.builtUpArea = builtUpArea;
	}


	public double getAgeOfConstruction() {
		return ageOfConstruction;
	}


	public void setAgeOfConstruction(double ageOfConstruction) {
		this.ageOfConstruction = ageOfConstruction;
	}


	public boolean isInCity() {
		return isInCity;
	}


	public void setInCity(boolean isInCity) {
		this.isInCity = isInCity;
	}

    public double calculatePropertyTax() {
        double propertyTax;
        if (isInCity) {
            propertyTax = (builtUpArea * ageOfConstruction * baseValue) + (0.5 * builtUpArea);
        } else {
            propertyTax = builtUpArea * ageOfConstruction * baseValue;
        }
        return propertyTax;
    }
}
 class Vehicle {
    private String registrationNumber;
    private String brand;
    private double purchaseCost;
    private double maxVelocity;
    private int passengerCount;
    private String vehicleType;
    public Vehicle()
    {
    	super();
    }

    public Vehicle(String registrationNumber, String brand, double purchaseCost, double maxVelocity, int passengerCount, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.purchaseCost = purchaseCost;
        this.maxVelocity = maxVelocity;
        this.passengerCount = passengerCount;
        this.vehicleType = vehicleType;
    }

    public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPurchaseCost() {
		return purchaseCost;
	}

	public void setPurchaseCost(double purchaseCost) {
		this.purchaseCost = purchaseCost;
	}

	public double getMaxVelocity() {
		return maxVelocity;
	}

	public void setMaxVelocity(double maxVelocity) {
		this.maxVelocity = maxVelocity;
	}

	public int getPassengerCount() {
		return passengerCount;
	}

	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

    public double calculateVehicleTax() {
        double vehicleTax = 0.0;
        switch (vehicleType) {
            case "Petrol":
                vehicleTax = maxVelocity + passengerCount + (0.10 * purchaseCost);
                break;
            case "Diesel":
                vehicleTax = maxVelocity + passengerCount + (0.11 * purchaseCost);
                break;
            case "CNG/LPG":
                vehicleTax = maxVelocity + passengerCount + (0.12 * purchaseCost);
                break;
        }
        return vehicleTax;
    }
}
