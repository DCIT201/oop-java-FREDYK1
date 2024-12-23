import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class RentalAgency {
    private final List<Rentable> vehicles = new ArrayList<>();
    private final List<RentalTransaction> transactions = new ArrayList<>();

    // Add a vehicle to the agency
    public void addVehicle(Rentable vehicle) {
        vehicles.add(vehicle);
    }

    // Rent a vehicle
    public void rentVehicle(Customer customer, Rentable vehicle, int days, boolean insurance) throws VehicleNotAvailableException, CustomerNotEligibleException {
        if (!vehicle.isAvailableForRental()) {
            throw new VehicleNotAvailableException("Vehicle is not available for rental.");
        }
        if (!customer.isEligibleForRental()) {
            throw new CustomerNotEligibleException("Customer is not eligible for rental.");
        }
        vehicle.rent(customer, days);
        RentalTransaction transaction = new RentalTransaction(customer, vehicle, new Date(), days, insurance);
        transactions.add(transaction);
        customer.addRentalTransaction(transaction);
        customer.addCurrentRental(vehicle);
        customer.addPoints(days * 10); // Add loyalty points
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