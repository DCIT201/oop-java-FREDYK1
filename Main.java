public class Main {
    public static void main(String[] args) {
        // Create a rental agency
        RentalAgency rentalAgency = new RentalAgency();

        // Create customers
        Customer customer1 = Customer.createCustomer("John Doe", "DL123456");
        Customer customer2 = Customer.createCustomer("Jane Smith", "DL654321");

        // Create vehicles
        Car car1 = Vehicle.createCar("CAR123", "Toyota Camry", 50.0, true);
        Motorcycle motorcycle1 = Vehicle.createMotorcycle("MOTO123", "Harley Davidson", 30.0, true);
        Truck truck1 = Vehicle.createTruck("TRUCK123", "Ford F-150", 100.0, true);

        // Add vehicles to the rental agency
        rentalAgency.addVehicle(car1);
        rentalAgency.addVehicle(motorcycle1);
        rentalAgency.addVehicle(truck1);

        try {
            // Rent vehicles
            rentalAgency.rentVehicle(customer1, car1, 5, true);
            rentalAgency.rentVehicle(customer2, motorcycle1, 3, false);

            // Return vehicles
            rentalAgency.returnVehicle(customer1, car1, true);
            rentalAgency.returnVehicle(customer2, motorcycle1, false);

            // Print rental transactions
            for (RentalTransaction transaction : rentalAgency.getTransactions()) {
                System.out.println("Customer: " + transaction.getCustomer().getName());
                System.out.println("Vehicle: " + transaction.getVehicle().getModel());
                System.out.println("Rental Date: " + transaction.getRentalDate());
                System.out.println("Rental Days: " + transaction.getRentalDays());
                System.out.println("Insurance: " + transaction.isInsurance());
                System.out.println();
            }
        } catch (VehicleNotAvailableException | CustomerNotEligibleException e) {
            System.out.println(e.getMessage());
        }
    }
}