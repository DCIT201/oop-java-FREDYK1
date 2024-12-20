public class Truck extends Vehicle{
    @Override
    public int calculateRentalCost(int days) {
        return days * 100;
    }

    @Override
    public boolean isAvailable() {
        return false;
    }

}
