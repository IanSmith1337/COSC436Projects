package MoreMoreJava.PolymorphismExample;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Circle circleVar = new Circle();
        Square squareVar = new Square();
        Triangle triangleVar = new Triangle();
        Scanner scan = new Scanner(System.in);
        Integer which = Integer.parseInt(scan.nextLine());

        switch (which) {
            case 1:
                circleVar.setDisplay();
                break;
            case 2:
                squareVar.setDisplay();
                break;
            case 3:
                triangleVar.setDisplay();
                break;
            default:
                System.exit(1);
        }
        
        String color_value = scan.nextLine();

        switch (which) {
            case 1:
                circleVar.setColor(color_value);
                break;
            case 2:
                squareVar.setColor(color_value);
                break;
            case 3:
                triangleVar.setColor(color_value);
                break;
        }

        String size_value = scan.nextLine();

        switch (which) {
            case 1:
                circleVar.setSize(size_value);
                break;
            case 2:
                squareVar.setSize(size_value);
                break;
            case 3:
                triangleVar.setSize(color_value);
                break;
        }
        
        String location_value = scan.nextLine();

        switch (which) {
            case 1:
                circleVar.setLocation(location_value);
                break;
            case 2:
                squareVar.setLocation(location_value);
                break;
            case 3:
                triangleVar.setLocation(location_value);
                break;
        }

        switch (which) {
            case 1:
                System.out.println(circleVar.print());
                break;
            case 2:
                System.out.println(squareVar.print());
                break;
            case 3:
                System.out.println(triangleVar.print());
                break;
        }

        scan.close();
    }
}
