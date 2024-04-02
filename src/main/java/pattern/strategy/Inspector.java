package pattern.strategy;

public class Inspector {

    String NEW_LINE = "\n";

    String inspectVehicle(String vehicleType, int miles) {
        String report = "Type:  " + vehicleType + " (miles: " + miles + ") \n";
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
                report +="""
                    Tires: 115 psi (all 18)
                    Oil: full (15 Gallons)
                    Exhaust Tubes: Intact (2)
                    """;
                break;

        }

        return report;
    }
}
