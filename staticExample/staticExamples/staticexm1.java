package staticExamples;

public class staticexm1 {
	static int cnt=0;
	int no =0;
	static String Welcome="Let us learn Coding";
	
	public staticexm1() {
		cnt++;
		no++;
	}

	@Override
	public String toString() {
		return "static total =" +cnt + " instance no = "+ no;
	}
	

}
