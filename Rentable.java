public interface Rentable {
    void rent(Customer customer, int days);
    void returnVehicle();
    boolean isAvailableForRental();
    String getModel(); // Add this method
}