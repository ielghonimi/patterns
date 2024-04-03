package pattern.strategy;

public class VehicleFactory {

    public Vehicle getVehicle(String vehicleType) {
        return switch (vehicleType) {
            case "car" -> new Car();
            case "motorcycle" -> new MotorCycle();
            case "18-wheeler" -> new EighteenWheeler();
            default -> throw new RuntimeException("Unable to run report for " + vehicleType);
        };
    }
}
