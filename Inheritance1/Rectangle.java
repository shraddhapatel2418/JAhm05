package Inheritance1;

public class Rectangle {
	 int length;
	    int breadth;

	    void setDimensions(int length, int breadth) {
	        this.length = length;
	        this.breadth = breadth;
	    }
  
	    void printArea() {
	        int area = length * breadth;
	        System.out.println("Area of the rectangle: " + area);
	    }

	    void printPerimeter() {
	        int perimeter = 2 * (length + breadth);
	        System.out.println("Perimeter of the rectangle: " + perimeter);
	    }
}