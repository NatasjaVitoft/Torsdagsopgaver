package Task1;

public class Car {

    private String make;
    private String model;
    private int year;
    private String bodyStyle;
    private Driver driver;

    public Car (String make, String model, int year, String bodyStyle) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;
    }

    public String getDriver() {
        return driver.toString();
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Make: " + make + ". model: " + model + " ("+ year + "), BodyStyle: " + bodyStyle;
    }
}
