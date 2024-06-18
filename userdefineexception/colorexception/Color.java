package colorexception;

public class Color {
	private String colorname;

	public String getColorname() {
		return colorname;
	}

	public void setColorname(String colorname) {
		try {
			if(colorname.equals("red") || colorname.equals("blue") || colorname.equals("yellow")) {
				this.colorname = colorname;
			}
			else {
				throw new ColorEcxeption("Invalid Colors");
			}
		}catch(ColorEcxeption ce) {
			System.out.println(ce.getMessage());
		}

	}

	@Override
	public String toString() {
		return "Color [colorname=" + colorname + "]";
	}
	

}
