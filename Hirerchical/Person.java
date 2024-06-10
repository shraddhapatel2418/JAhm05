package Hirerchical;

public class Person {
	private String name,city;

	
	public Person() {
		//super();//it will call parent class default constructor
	System.out.println("I'm Person");
	}
	
	
	public Person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
