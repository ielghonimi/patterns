package pattern.strategy;

public class Inspector {

    private final static VehicleFactory factory = new VehicleFactory();
    String inspectVehicle(String vehicleType, int miles) {
        Vehicle vehicle = factory.getVehicle(vehicleType);
        return vehicle.inspect(miles);
    }
}
