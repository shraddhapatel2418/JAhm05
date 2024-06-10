//28-05-024
package Hirerchical;

public class Demo {
	public static void main(String[] args) {
		Student st=new Student();
		st.setName("Shraddha");
		st.setCity("Ahemdabad");
		st.setDiv("B");
		
		System.out.println(st);
		
		Student st2=new Student("Noor","kadi","D");
		System.out.println(st2);
		
		Employee emp=new Employee("Hir","Kalol","Hod");
		System.out.println(emp);
		//Person p =new 
		//Person p;
		//p=new Employee();
		//System.out.println(p instanceof Employee);
		//instance of using to check the this object is instance of the class or not
	}
}
