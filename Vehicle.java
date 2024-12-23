public abstract class Vehicle {
    private final String vehicleId;
    private final String model;
    private final double baseRentalRate;
    private boolean isAvailable;
    private double rating;

    protected Vehicle(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        if (vehicleId == null || vehicleId.isEmpty()) {
            throw new IllegalArgumentException("Vehicle ID cannot be null or empty.");
        }
        if (model == null || model.isEmpty()) {
            throw new IllegalArgumentException("Model cannot be null or empty.");
        }
        if (baseRentalRate <= 0) {
            throw new IllegalArgumentException("Base rental rate must be positive.");
        }
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = isAvailable;
    }

    // Static factory methods
    public static Car createCar(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        return new Car(vehicleId, model, baseRentalRate, isAvailable);
    }

    public static Motorcycle createMotorcycle(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        return new Motorcycle(vehicleId, model, baseRentalRate, isAvailable);
    }

    public static Truck createTruck(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        return new Truck(vehicleId, model, baseRentalRate, isAvailable);
    }

    // Getters
    public String getVehicleId() {
        return vehicleId;
    }

    public String getModel() {
        return model;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Rating system
    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating < 0 || rating > 5) {
            throw new IllegalArgumentException("Rating must be between 0 and 5.");
        }
        this.rating = rating;
    }

    // Abstract methods for rental calculation
    public abstract double calculateRentalCost(int days);
    public abstract boolean isAvailableForRental();
}