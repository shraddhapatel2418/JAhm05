package CovariantAddition;

public class CovariantAddition1 {
	public static void main(String[] args) {
        Number num1 = new Number(10);
        Number num2 = new SubNumber(20); // Using covariant return type
        Number sum = num1.add(num2);
        sum.display();
    }
}
