package pattern.strategy;

public class InputValues {

    private final int miles;
    private final String vehicle;

    public InputValues(int miles, String vehicle) {
        this.miles = miles;
        this.vehicle = vehicle;
    }

    public int getMiles() {
        return miles;
    }

    public String getVehicle() {
        return vehicle;
    }
}
