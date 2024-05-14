public class Rectangle extends Shape {
    private double length;
    private double breath;

    public Rectangle(double length, double breath) {
        this.length = length;
        this.breath = breath;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double calculateArea() {
        return breath * length;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }
}
