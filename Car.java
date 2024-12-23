public class Car extends Vehicle implements Rentable {
    public Car(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        super(vehicleId, model, baseRentalRate, isAvailable);
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getBaseRentalRate();
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public void rent(Customer customer, int days) {
        if (isAvailable()) {
            setAvailable(false);
            System.out.println("Car rented to " + customer.getName() + " for " + days + " days.");
        } else {
            System.out.println("Car is not available.");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailable(true);
        System.out.println("Car returned.");
    }

    // Overloaded method
    public void rent(Customer customer, int days, boolean insurance) {
        if (isAvailable()) {
            setAvailable(false);
            System.out.println("Car rented to " + customer.getName() + " for " + days + " days.");
            if (insurance) {
                System.out.println("Insurance purchased.");
            }
        } else {
            System.out.println("Car is not available.");
        }
    }

    // Overloaded method
    public void returnVehicle(boolean insurance) {
        setAvailable(true);
        System.out.println("Car returned.");
        if (insurance) {
            System.out.println("Insurance processed.");
        }
    }
}