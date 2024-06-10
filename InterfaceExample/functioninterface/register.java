package functioninterface;

public interface register {
	void showReceipt();
	default void getID() {
		 System.out.println("ID " + 13);
	 }
}
