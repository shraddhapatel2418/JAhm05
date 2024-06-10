//
package methodoverriding;

public class Child extends Patent {
	
	@Override
	public void sayHello(String msg) {
		super.sayHello("i'm Parent ");//call function of d
		System.out.println("Hii I'm child " + msg);
	}

}
