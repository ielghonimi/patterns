package pattern.strategy;

public class Car implements Vehicle {
    @Override
    public String inspect(int miles) {
        return """
                Type: Car (miles: %d)
                Tires: 35 psi (all 4)
                Oil: full (4 quarts)
                Hubcap: Front driver side missing
                RearWindow: small crack
                """
                .formatted(miles);
    }
}
