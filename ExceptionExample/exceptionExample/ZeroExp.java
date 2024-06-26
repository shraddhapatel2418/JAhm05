package exceptionExample;
import java.lang.Exception;

public class ZeroExp {
	public static void main(String[] args) {
		int a,b,c;
		a=12;
		b=0;
		
		try {
			int[] arr= {1,2,3,4,5};
			c=a/b;
			
			System.out.println(arr[10]);
			System.out.println("Will not be printed");
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException ari) {
			System.out.println(ari.getMessage());
		}
		catch(Exception eo){
			System.out.println(eo.getMessage());
		}
		finally {
			System.out.println("Bye...Bye...");
		}
	}
}
