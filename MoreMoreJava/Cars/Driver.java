package MoreMoreJava.Cars;

public class Driver {
    public static void main(String[] args) {
        TruckModified mytruck = new TruckModified();
        System.out.println(mytruck);        // Output:
        mytruck.m1();		                // Output:
        mytruck.m2();		                // Output:
    }
}


// Without Polymorphism:
/* System.out.println(mycar);      // Output: vroom
mycar.m1();		// Output: car 1 
mycar.m2();		// Output: car 2 
System.out.println(mytruck);	// Output: vroom 
mytruck.m1();		// Output: truck 1 
mytruck.m2();		// Output: car 2 */

//With Polymorphism:
/* TruckModified mytruck = new TruckModified();
System.out.println(mytruck);      // Output:
mytruck.m1();		// Output:
mytruck.m2();		// Output: */
