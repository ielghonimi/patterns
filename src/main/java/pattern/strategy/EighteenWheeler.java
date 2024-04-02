package pattern.strategy;

public class EighteenWheeler implements Vehicle {
    @Override
    public String inspect(int miles) {
        return """
                Type: 18-Wheeler (miles: %d)
                Tires: 115 psi (all 18)
                    Oil: full (15 Gallons)
                    Exhaust Tubes: Intact (2)
                """
                .formatted(miles);
    }
}
