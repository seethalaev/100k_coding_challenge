package Day_8
{
    class Car {
    String model;
    int year;

    // Default constructor
    public Car() {
        model = "Unknown";
        year = 0;
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        System.out.println("Parameterized constructor called");
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Manufacture Year: " + year);
    }
}
}
public class main {
    public static void main(String[] args) {
        // Using default constructor
        Car car1 = new Car();
        car1.displayDetails();

        System.out.println();

        // Using parameterized constructor
        Car car2 = new Car("Toyota", 2020);
        car2.displayDetails();
    }
}
