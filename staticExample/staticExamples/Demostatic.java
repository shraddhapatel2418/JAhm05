package staticExamples;

public class Demostatic {

	public static void main(String[] args) {
		
		
		staticexm1 s1=new staticexm1();
		System.out.println(s1);
		
		staticexm1 s2=new staticexm1();
		System.out.println(s2);
		
		//for a static a single copy is created ,if we create second copy it used first copy
		//thats it increment by 1 again and give 2
		
		//and instance is used base copy so it give every time 1 only
		System.out.println(staticexm1.Welcome);
		//it's depended on class ,we can 
	}

}



//when u want to pass all the user and count the student using static
//write a program how many object are there