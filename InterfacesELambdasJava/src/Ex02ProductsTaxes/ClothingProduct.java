package Ex02ProductsTaxes;

public record ClothingProduct(double basePrice) implements Product {

    private static final double clothingTax = 0.025;

    @Override
    public double getFinalPrice() {
        return basePrice * (1 + clothingTax/100);
    }
}
