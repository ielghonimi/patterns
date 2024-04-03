package pattern.strategy;

public class Inspector {

    String inspectVehicle(String vehicleType, int miles) {
        String report;
        Vehicle vehicle = switch (vehicleType) {
            case "car" -> new Car();
            case "motorcycle" -> new MotorCycle();
            case "18-wheeler" -> new EighteenWheeler();
            default -> null;
        };
        if(vehicle != null) {
            report = vehicle.inspect(miles);
        } else {
            throw new RuntimeException("Unable to run report for " + vehicleType);
        }

        return report;
    }
}
