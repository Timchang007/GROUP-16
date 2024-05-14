public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    public String getName(){
        return "Triangle";
    }
    @Override
    public double calculateArea(){
        return 0.5 *base*height;
    }
    @Override
    public double calculateVolume(){
        return 0.0;
    }
}
