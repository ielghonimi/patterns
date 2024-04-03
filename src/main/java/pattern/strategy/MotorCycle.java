package pattern.strategy;

public class MotorCycle implements Vehicle {
    @Override
    public String inspect(int miles) {
        return """
                Type: Motorcycle (miles: %d)
                Tires: 40 psi (all 2)
                Oil: full (3 quarts)
                """
                .formatted(miles);
    }
}
