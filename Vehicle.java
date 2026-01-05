abstract class Vehicle {
    protected double rentalRate;
    abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
}

class Car extends Vehicle implements Insurable {
    public double calculateRentalCost(int days) { return days * rentalRate; }
    public double calculateInsurance() { return 500; }
}

class Bike extends Vehicle {
    public double calculateRentalCost(int days) { return days * rentalRate; }
}
class Truck extends Vehicle implements Insurable {
    public double calculateRentalCost(int days) { return days * rentalRate * 1.5; }
    public double calculateInsurance() { return 1000; }
}