import java.util.Date;

public class RentalTransaction {
    private Customer customer;
    private Rentable vehicle;
    private Date rentalDate;
    private int rentalDays;
    private boolean insurance;

    public RentalTransaction(Customer customer, Rentable vehicle, Date rentalDate, int rentalDays, boolean insurance) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.rentalDate = rentalDate;
        this.rentalDays = rentalDays;
        this.insurance = insurance;
    }

    // Getter and Setter for customer
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    // Getter and Setter for vehicle
    public Rentable getVehicle() {
        return vehicle;
    }

    public void setVehicle(Rentable vehicle) {
        this.vehicle = vehicle;
    }

    // Getter and Setter for rentalDate
    public Date getRentalDate() {
        return rentalDate;
    }

    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    // Getter and Setter for rentalDays
    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    // Getter and Setter for insurance
    public boolean isInsurance() {
        return insurance;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }
}