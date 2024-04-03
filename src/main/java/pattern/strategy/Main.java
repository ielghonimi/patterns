package pattern.strategy;

public class Main {

    private static final Inspector inspector = new Inspector();
    private static final String ERROR_MESSAGE = "You must enter 1, 2, or 3 (or 9 to exit)";

    public static void main(String[] args) {
        InputScanner inputScanner = new InputScanner();

         for(;;) {
             try {
                 InputValues inputValues = inputScanner.getInputValues();
                 printInspectionReport(inputValues.getVehicle(), inputValues.getMiles());
             } catch (Exception ex) {
                 printErrorMessage(ex);
             }
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
        System.err.println(ex.getMessage());
        System.out.println(ERROR_MESSAGE);
        System.out.println();
    }
}