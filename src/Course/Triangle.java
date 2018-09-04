package Course;

public class Triangle {
	
	public double a;
	public double b;
	public double c;
	
	public double area() {
		
		double p;
		double area;
		
		p = (a + b + c) / 2;
		area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		return area;


		
	}

}
