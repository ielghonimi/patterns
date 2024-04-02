package pattern.strategy;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> types = Map.of(1, "car",
                2, "motorcycle",
                3, "18-wheeler");
        Inspector inspector = new Inspector();
     for(;;) {
         Scanner scanner = new Scanner(System.in);
         String vehicleType = """
                 Select vehicle type:
                 Enter 1, 2, or 3 (9 to exit)
                 1 for car
                 2 for motorcycle
                 3 for 18-wheeler
                 """;
         System.out.println(vehicleType);
         try {
             int typeOfVehicle = scanner.nextInt();  // Read user input
             if (typeOfVehicle == 9) {
                 break;
             }
             String vehicle = types.get(typeOfVehicle);
             if (vehicle == null) {
                 System.out.println("You must enter 1, 2, or 3 (or 9 to exit)");
                 continue;
             }
             System.out.println("Enter number of miles");
             int miles = scanner.nextInt();
             String report = inspector.inspectVehicle(vehicle, miles);
             System.out.println("Inspection Report");
             System.out.println("-----------------");
             System.out.println(report);
             System.out.println("---------------------------");
         } catch (Exception ex) {
             System.err.println(ex);
         }
     }
    }
}