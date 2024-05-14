public class Cube extends Shape {
    private double length;

    public Cube(double length){
        this.length = length;
    }
    @Override
    public String getName(){
        return "Cube";
    }
    @Override
    public double calculateArea(){
        return length * length * 6;
    }
    @Override
    public double calculateVolume(){
        return length * length * length;
    }
}
