package pattern.strategy;

import java.util.Map;
import java.util.Scanner;

public class InputScanner {
    private final Scanner scanner = new Scanner(System.in);
    private static final String VEHICLE_TYPE = """
            Select vehicle type:
            Enter 1, 2, or 3 (9 to exit)
            1 for car
            2 for motorcycle
            3 for 18-wheeler
            """;
    private static final Map<Integer, String> types = Map.of(1, "car",
            2, "motorcycle",
            3, "18-wheeler");
    private static final String MILES_MESSAGE = "Enter number of miles";

   public InputValues getInputValues() {
       try {
           System.out.println(VEHICLE_TYPE);
           int typeOfVehicle = scanner.nextInt();  // Read user input
           if (typeOfVehicle == 9) {
               System.exit(0);
           }
           String vehicle = types.get(typeOfVehicle);
           if (vehicle == null) {
               throw new RuntimeException("Unable to find vehicle type");
           }
           System.out.println(MILES_MESSAGE);
           int miles = scanner.nextInt();
           return new InputValues(miles, vehicle);
       } catch (Exception ex) {
           scanner.nextLine();
           throw new RuntimeException("Unable to get input", ex);
       }
   }

}
