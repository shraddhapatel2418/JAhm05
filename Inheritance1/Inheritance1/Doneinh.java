package Inheritance1;

public class Doneinh {
	public static void main(String[] args) {
        
		 Square square = new Square();
	        
	        // Demonstrating the square functionality
	        square.setSide(4);
	        System.out.println("Square:");
	        square.printArea();           // Output: Area: 16
	        square.printPerimeter();      // Output: Perimeter: 16

	        // Using the same object to demonstrate the rectangle functionality
	        square.setDimensions(4, 5);
	        System.out.println("\nRectangle:");
	        square.printArea();           // Output: Area: 20
	        square.printPerimeter();  
    }
}
