public class Car extends Vehicle { 
    
    public int calculateRentalCost(int days) {
        return days * 50;
    }

    public boolean isAvailable() {
        return true; 
    }
}
