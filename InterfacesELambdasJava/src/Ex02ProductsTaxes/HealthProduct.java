package Ex02ProductsTaxes;

public record HealthProduct(double basePrice) implements Product{

    private static final double healthTax = 0.015;

    @Override
    public double getFinalPrice() {
        return basePrice * (1 + healthTax/100);
    }
}
