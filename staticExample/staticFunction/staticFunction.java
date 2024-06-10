package staticFunction;

public class staticFunction {
	//private int salary;
	private static int cnt;
	
	public static void showdata()
	{
		//salary=23000;non static vr not allowed
		cnt++;
		System.out.println(cnt);
	}
}
