package Hirerchical;

public class Employee extends Person{
	private String depart;

	
	public Employee(String name,String city,String depart) {
		super(name,city);
		this.depart = depart;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	@Override
	public String toString() {
		return "[name = "+ getName() +" city = "+getCity()+ " depart= " + depart;
	}
	

}
