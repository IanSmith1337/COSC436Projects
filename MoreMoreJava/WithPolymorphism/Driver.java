package MoreMoreJava.WithPolymorphism;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Shape shapeVar;

        Scanner scan = new Scanner(System.in);
        int which = Integer.parseInt(scan.nextLine());
        
        switch (which) {
            case 1:
                shapeVar = new Circle();
                break;
            case 2:
                shapeVar = new Square();
                break;
            case 3:
                shapeVar = new Triangle();
                break;
            default:
                shapeVar = new Circle();
                System.exit(1);
        }
        
        String color_value = scan.nextLine();

        shapeVar.setColor(color_value);

        String size_value = scan.nextLine();

        shapeVar.setSize(size_value);
        
        String location_value = scan.nextLine();

        shapeVar.setLocation(location_value);

        System.out.println(shapeVar.print());
    }
}



