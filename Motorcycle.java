public class Motorcycle extends Vehicle{
    @Override
    public int calculateRentalCost(int days) {
        return days * 30; 
    }

    @Override
    public boolean isAvailable() {
        return true;
    }
}
