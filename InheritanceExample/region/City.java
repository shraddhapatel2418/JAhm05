package region;

public class City extends State{

	private String City_Name;

	public String getCity_Name() {
		return City_Name;
	}

	public void setCity_Name(String city_Name) {
		City_Name = city_Name;
	}

	@Override
	public String toString() {
		return "[Country = " + getCname() + "]  [State =" + getStname() + "]  [City = " + City_Name + "]";
	}
	
	
}
