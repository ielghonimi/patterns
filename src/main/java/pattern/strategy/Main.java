package pattern.strategy;

import java.util.Map;
import java.util.Scanner;

public class Main {

    public static final String VEHICLE_TYPE = """
            Select vehicle type:
            Enter 1, 2, or 3 (9 to exit)
            1 for car
            2 for motorcycle
            3 for 18-wheeler
            """;
    private static final Inspector inspector = new Inspector();
    private static final Map<Integer, String> types = Map.of(1, "car",
                2, "motorcycle",
                3, "18-wheeler");
    public static final String ERROR_MESSAGE = "You must enter 1, 2, or 3 (or 9 to exit)";
    public static final String MILES_MESSAGE = "Enter number of miles";

    private static class InputValues {
        int miles;
        String vehicle;

        public InputValues(int miles, String vehicle) {
            this.miles = miles;
            this.vehicle = vehicle;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         for(;;) {
             try {
                 InputValues inputValues = getInputValues(scanner);
                 printInspectionReport(inputValues.vehicle, inputValues.miles);
             } catch (Exception ex) {
                 printErrorMessage(ex);
                 scanner.nextLine();
             }
         }
    }

    private static InputValues getInputValues(Scanner scanner) {
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
            throw new RuntimeException("Unable to get input", ex);
        }
    }

    private static void printInspectionReport(String vehicle, int miles) {
             String report = inspector.inspectVehicle(vehicle, miles);
             System.out.println("Inspection Report");
             System.out.println("-----------------");
             System.out.println(report);
             System.out.println("---------------------------");
    }

    private static void printErrorMessage(Exception ex) {
        System.out.println(ex.getMessage());
        System.out.println(ERROR_MESSAGE);
        System.out.println();
    }
}