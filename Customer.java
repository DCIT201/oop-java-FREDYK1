public class Customer {
    private String name;
    private boolean hasMembership;
    private boolean hasInsurance;
    
    public Customer(String name, boolean hasMembership, boolean hasInsurance) {
        this.name = name;
        this.hasMembership = hasMembership;
        this.hasInsurance = hasInsurance;
    }
    
    public String getName() {
        return name;
    }
    
    public boolean hasMembership() {
        return hasMembership;
    }
    
    public boolean hasInsurance() {
        return hasInsurance;
    }
}
