package bankactivites;

public class BankTransaction implements Bank{
	
	@Override
	public void deposite(Account acc,int amt) {
		acc.setBal(acc.getBal() + amt);
		
		System.out.println("Balance Updated");
	}
	public void withdraw(Account acc,int amt) {
		acc.setBal(acc.getBal() -amt);
		
		System.out.println("Balance Updated");
	}


}
