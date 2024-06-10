//this is the example of Hierarchical inheritance
package inheritEmployee;

public class Done {
	
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.name="Shraddha";
		emp.age=23;
		emp.phoneNumber="123-567-7765";
		emp.address="B1, VrundavanNagar,Ahemdabad";
		emp.salary=45000;
		
		Manager manager = new Manager();
        manager.name = "Hirva";
        manager.age = 45;
        manager.phoneNumber = "098-765-4321";
        manager.address = "456 Elm ,Mahesana";
        manager.salary = 80000.0;
        manager.department = "IT";
        
        
        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Phone Number: " + emp.phoneNumber);
        System.out.println("Address: " + emp.address);
        System.out.println("Specialization: " + emp.specialization);
        emp.printSalary();

        // Printing Manager details
        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        System.out.println("Department: " + manager.department);
        manager.printSalary();
	}

}
