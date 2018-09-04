package Course;

public class Operadores {
	
	public static void main(String[] args) {
		
		int n1 = 3 + 4*2;
		int n2 = (3+4)*2;
		int n3 = 17%3;
		
		System.out.println("n1: " + n1 + " n2: " + n2 + " n3: " + n3);
		
		double a = 1.0, b = -3.0, c = -4.0;
		double x1 = (- b + Math.sqrt(b * b - 4.0 * a * c)) / (2 * a);
		
		System.out.println("x1:" + x1);
		
	}

}
