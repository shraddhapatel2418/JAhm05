package functioninterface;

//@FunctionalInterface
//using this we can't able to create other function
public interface GreetInterface extends register {
	
	void sayHello();
	default void getID() {
		
	}
}

