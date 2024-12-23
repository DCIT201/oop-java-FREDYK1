import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class RentalAgency {
    private List<Rentable> vehicles = new ArrayList<>();
    private List<RentalTransaction> transactions = new ArrayList<>();

    // Add a vehicle to the agency
    public void addVehicle(Rentable vehicle) {
        vehicles.add(vehicle);
    }

    // Rent a vehicle
    public void rentVehicle(Customer customer, Rentable vehicle, int days, boolean insurance) {
        if (vehicle.isAvailableForRental() && customer.isEligibleForRental()) {
            vehicle.rent(customer, days);
            RentalTransaction transaction = new RentalTransaction(customer, vehicle, new Date(), days, insurance);
            transactions.add(transaction);
            customer.addRentalTransaction(transaction);
            customer.addCurrentRental(vehicle);
        } else {
            System.out.println("Vehicle is not available for rental or customer is not eligible.");
        }
    }

    // Return a vehicle
    public void returnVehicle(Customer customer, Rentable vehicle, boolean insurance) {
        vehicle.returnVehicle();
        customer.removeCurrentRental(vehicle);
        if (insurance) {
            System.out.println("Insurance processed.");
        }
    }

    // Get all transactions
    public List<RentalTransaction> getTransactions() {
        return transactions;
    }
}