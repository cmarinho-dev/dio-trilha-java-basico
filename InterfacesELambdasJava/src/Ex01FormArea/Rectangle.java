package Ex01FormArea;

public record  Rectangle(double width, double height) implements GeometricForm {

    @Override
    public double getArea() {
        return width * height;
    }
}
