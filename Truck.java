public class Truck extends Vehicle implements Rentable {
    private int rentalCostPerDay = 100;
    private boolean available = false;

    @Override
    public double calculateRentalCost(int days) {
        return days * rentalCostPerDay;
    }

    @Override
    public boolean isAvailableForRental() {
        return available;
    }

    // Getter and Setter for rentalCostPerDay
    public int getRentalCostPerDay() {
        return rentalCostPerDay;
    }

    public void setRentalCostPerDay(int rentalCostPerDay) {
        if (rentalCostPerDay > 0) {
            this.rentalCostPerDay = rentalCostPerDay;
        } else {
            throw new IllegalArgumentException("Rental cost per day must be positive.");
        }
    }

    // Getter and Setter for available
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public void rent(Customer customer, int days) {
        if (available) {
            available = false;
            System.out.println("Truck rented to " + customer.getName() + " for " + days + " days.");
        } else {
            System.out.println("Truck is not available.");
        }
    }

    @Override
    public void returnVehicle() {
        available = true;
        System.out.println("Truck returned.");
    }

    // Overloaded method
    public void rent(Customer customer, int days, boolean insurance) {
        if (available) {
            available = false;
            System.out.println("Truck rented to " + customer.getName() + " for " + days + " days.");
            if (insurance) {
                System.out.println("Insurance purchased.");
            }
        } else {
            System.out.println("Truck is not available.");
        }
    }

    // Overloaded method
    public void returnVehicle(boolean insurance) {
        available = true;
        System.out.println("Truck returned.");
        if (insurance) {
            System.out.println("Insurance processed.");
        }
    }
}