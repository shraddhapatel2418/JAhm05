package bankactivites;

public class DemoBank {
	public static void main(String[] args) {
		Account acc=new Account();
		acc.setAccname("shraddha");
		acc.setEmail("shraddha123@gmailcom");
		acc.setBal(5000);
		System.out.println(acc);
		
		BankTransaction bt =new BankTransaction();
		
		bt.deposite(acc, 4000);
		System.out.println(acc);
		
		bt.withdraw(acc, 1200);
		System.out.println(acc);
		
		//Bank b=new BankTransaction();
		//possible
		//we can refrense not directly
		
		
	}
	
}
