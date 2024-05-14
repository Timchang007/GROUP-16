public class Cuboid extends Shape {
    private double length;
    private double breath;
    private double height;

    public Cuboid(double length, double breath, double height){
        this.length = length;
        this.breath = breath;
        this.height = height;
    }
    @Override
    public String getName(){
        return "Cuboid";
    }
    @Override
    public double calculateArea(){
        return 2 * length + 2 * breath + 2 * height;
    }
    @Override
    public double calculateVolume(){
        return length * breath * height;
    }



}
