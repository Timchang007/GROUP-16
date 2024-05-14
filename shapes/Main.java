import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = null;
        System.out.println("Select a Shape");
        System.out.println("1. Triangle");
        System.out.println("2. Circle");
        System.out.println("3. Rectangle");
        System.out.println("4. Cube");
        System.out.println("5. Cuboid");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter base of triangle:");
                double base = scanner.nextDouble();
                System.out.print("Enter height of the triangle:");
                double height = scanner.nextDouble();
                shape = new Triangle(base, height);
                System.out.println("Area of the triangle:" + shape.calculateArea());
                break;
            case 2:
                System.out.println("Enter radius of a circle:");
                double radius = scanner.nextDouble();
                Circle circle = new Circle();
                shape = circle;
                System.out.println("Area of the circle "+ shape.calculateArea());
                break;
            case 3:
                System.out.print("Enter length of Rectangle:");
                double length = scanner.nextDouble();
                System.out.print("Enter breath of the Rectangle:");
                double breath = scanner.nextDouble();
                shape = new Rectangle(length, breath);
                System.out.println("Area of the Rectangle:" + shape.calculateArea());
                break;
            case 4:
                System.out.print("Enter length of Rectangle:");
                double clength = scanner.nextDouble();
                shape = new Cube(clength);
                System.out.println("Area of the Cube:" + shape.calculateArea());
                System.out.println("Volume of the Cube:" + shape.calculateVolume());
                break;
            case 5:
                System.out.print("Enter length of Cuboid:");
                double culength = scanner.nextDouble();
                System.out.print("Enter breath of Cuboid:");
                double cubreath = scanner.nextDouble();
                System.out.print("Enter height of Cuboid:");
                double cuheight = scanner.nextDouble();
                shape = new Cuboid(culength, cubreath, cuheight);
                System.out.println("Area of the Cuboid:" + shape.calculateArea());
                System.out.println("Volume of the Cuboid:" + shape.calculateVolume());
                break;
            default:
                break;
        }

        scanner.close();
    }

}
