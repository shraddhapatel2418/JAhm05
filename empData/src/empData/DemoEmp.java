package empData;
//import java.util.Scanner;
public class DemoEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeData ed = new EmployeeData();
		ed.setName("Shraddha");
		ed.setDesignation("Manager");
		ed.setBasicSalary(50000);
		
		System.out.println(ed);
		
		EmployeeData ed2 = new EmployeeData("Diya","HR",3456852);
		
		System.out.println(ed2);
	}

}
