public class Motorcycle extends Vehicle, Rentable {
    private int rentalCostPerDay = 30;
    private boolean available = true;

    @Override
    public int calculateRentalCost(int days) {
        return days * rentalCostPerDay;
    }

    @Override
    public boolean isAvailable() {
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
    public boolean getisAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public void rent(Customer customer, int days) {
        if (available) {
            available = false;
            System.out.println("Motorcycle rented to " + customer.getName() + " for " + days + " days.");
        } else {
            System.out.println("Motorcycle is not available.");
        }
    }

    @Override
    public void returnVehicle(){
        available = true;
        System.out.println("Motorcycle returned.");
    }

    @Overloading
    public void rent(Customer customer, int days, boolean insurance) {
        if (available) {
            available = false;
            System.out.println("Motorcycle rented to " + customer.getName() + " for " + days + " days.");
            if (insurance) {
                System.out.println("Insurance purchased.");
            }
        } else {
            System.out.println("Motorcycle is not available.");
        }
    }

    @Overloading
    public void returnVehicle(boolean insurance){
        available = true;
        System.out.println("Motorcycle returned.");
        if (insurance) {
            System.out.println("Insurance returned.");
        }
    }
}