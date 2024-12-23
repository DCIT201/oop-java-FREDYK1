import java.util.Date;

public final class RentalTransaction {
    private final Customer customer;
    private final Rentable vehicle;
    private final Date rentalDate;
    private final int rentalDays;
    private final boolean insurance;

    public RentalTransaction(Customer customer, Rentable vehicle, Date rentalDate, int rentalDays, boolean insurance) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDate = rentalDate;
        this.rentalDays = rentalDays;
        this.insurance = insurance;
    }

    // Getters
    public Customer getCustomer() {
        return customer;
    }

    public Rentable getVehicle() {
        return vehicle;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public boolean isInsurance() {
        return insurance;
    }
}