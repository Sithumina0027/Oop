public class Car {
    
    private String carNumber;
    private String modelName;
    private String chassisNumber;
    private double mileage;


    public Car(String carNumber, String modelName, String chassisNumber, double mileage) {
        this.carNumber = carNumber;
        this.modelName = modelName;
        this.chassisNumber = chassisNumber;
        this.mileage = mileage;
    }

    public String getCarNumber() {
        return carNumber;
    }

    
    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    
    public String getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    
    public double getMileage() {
        return mileage;
    }

    
    public static void main(String[] args) {
        
        Car myCar = new Car("ABC123", "Toyota Camry", "XYZ789", 30.5);

        
        System.out.println("Car Number: " + myCar.getCarNumber());
        System.out.println("Model Name: " + myCar.getModelName());
        System.out.println("Chassis Number: " + myCar.getChassisNumber());
        System.out.println("Mileage: " + myCar.getMileage());

        
        myCar.setCarNumber("DEF456");
        myCar.setModelName("Honda Civic");
        myCar.setChassisNumber("LMN123");

        
        System.out.println("\nUpdated Car Details:");
        System.out.println("Car Number: " + myCar.getCarNumber());
        System.out.println("Model Name: " + myCar.getModelName());
        System.out.println("Chassis Number: " + myCar.getChassisNumber());
        System.out.println("Mileage: " + myCar.getMileage());
    }
}
