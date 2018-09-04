package entities;

public class Employee {

	public String Name;
	public double Salario;
	public double Tax;
	
	public Employee() {
		this.Salario = SalarioLiquido();
	}
	
	public double SalarioLiquido() {
		return Salario - (Salario*Tax/100);
	}
	
	public void SalarioAumentado(double percentage) {
		Salario = Salario + (Salario*Tax/100);
	}
	
	public String toString() {
		return "Employee : " + Name
				+ ", $ " + String.format("%.2f%n", Salario);
				
	}
	

}
