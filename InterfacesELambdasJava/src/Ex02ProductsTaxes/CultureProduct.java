package Ex02ProductsTaxes;

public record CultureProduct(double basePrice) implements Product {

    private static final double cultureTax = 0.04;

    @Override
    public double getFinalPrice() {
        return basePrice * (1 + cultureTax/100);
    }
}
