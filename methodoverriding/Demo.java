package methodoverriding;

public class Demo {

	public static void main(String[] args) {
		
		//Child ch=new Child();
		//ch.sayHello(" Good Morning");
		
		Patent pt = new Child();
		pt.sayHello(" Have a nice day");
		
		//Patent p1=new Patent();
		//p1.sayHello(" Heyyy....");
		
		//Child ch = new Patent();
		//u can covnvert smaller to bigger but this is not possible

	}

}
