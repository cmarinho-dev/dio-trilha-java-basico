package Ex02ProductsTaxes;

public record FoodProduct(double basePrice) implements  Product {

    private static final double foodTax = 0.01;

    @Override
    public double getFinalPrice() {
        return basePrice * (1 + foodTax/100);
    }
}
