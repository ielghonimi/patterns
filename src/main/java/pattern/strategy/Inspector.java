package pattern.strategy;

public class Inspector {

    String inspectVehicle(String vehicleType, int miles) {
        String report = "Type:  " + vehicleType + " (miles: " + miles + ") \n";
        Vehicle vehicle = null;
        switch (vehicleType) {
            case "car":
                report += """
                          Tires: 35 psi (all 4)
                          Oil: full (4 quarts)
                          Hubcap: Front driver side missing
                          RearWindow: small crack
                          """;
                break;
            case "motorcycle":
                report += """
                        Tires: 40 psi (all 2)
                        Oil: full (3 quarts)
                        """;
                break;
            case "18-wheeler":
                vehicle = new EighteenWheeler();
                break;

        }
        if(vehicle != null) {
            report = vehicle.inspect(miles);
        }

        return report;
    }
}
