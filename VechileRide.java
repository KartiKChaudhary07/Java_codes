abstract class VehicleRide {
    protected double ratePerKm;
    abstract double calculateFare(double distance);
}

interface GPS {
    String getCurrentLocation();
}

class CarRide extends VehicleRide {
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }
}
class BikeRide extends VehicleRide implements GPS {
    public double calculateFare(double distance) {
        return distance * ratePerKm * 0.8;
    }

    public String getCurrentLocation() {
        return "Current location from Bike GPS";
    }
}