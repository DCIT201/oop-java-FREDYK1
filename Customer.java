import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String driverLicenseNumber;
    private List<RentalTransaction> rentalHistory = new ArrayList<>();
    private List<Rentable> currentRentals = new ArrayList<>();

    public Customer(String name, String driverLicenseNumber) {
        this.name = name;
        this.driverLicenseNumber = driverLicenseNumber;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for driverLicenseNumber
    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public void setDriverLicenseNumber(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }

    // Manage rental history
    public List<RentalTransaction> getRentalHistory() {
        return rentalHistory;
    }

    public void addRentalTransaction(RentalTransaction transaction) {
        rentalHistory.add(transaction);
    }

    // Track current rentals
    public List<Rentable> getCurrentRentals() {
        return currentRentals;
    }

    public void addCurrentRental(Rentable rental) {
        currentRentals.add(rental);
    }

    public void removeCurrentRental(Rentable rental) {
        currentRentals.remove(rental);
    }

    // Implement rental eligibility checks
    public boolean isEligibleForRental() {
        // Example eligibility check: customer can rent up to 3 vehicles at a time
        return currentRentals.size() < 3;
    }
}