package Hirerchical;

public class Student extends Person{
	private String div;
	
	public Student() {
		super();
		System.out.println("I'm Student");
	}
	
	public Student(String name,String city,String div) {
		super(name,city);
		this.div = div;
	}

	public String getDiv() {
		return div;
	}

	public void setDiv(String div) {
		this.div = div;
	}

	@Override
	public String toString() {
		return "[name = "+ getName() +" city = "+getCity()+" Student div=" + div + "]";
	}
	
}
