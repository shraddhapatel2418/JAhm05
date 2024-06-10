package Covarient;

public class CovariantReturnTypeExample {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent parentInstance = parent.getInstance(); // returns a Parent instance
        //System.out.println("Parent instance: " + parentInstance);
        
        Child child = new Child();
        Child childInstance = child.getInstance(); // returns a Child instance
        childInstance.childMethod(); // Call method specific to Child
    }
}
