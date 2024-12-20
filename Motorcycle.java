public class Motorcycle extends Vehicle {
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
}