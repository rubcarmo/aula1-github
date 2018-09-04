package entities;

public class Product {
	
	public String Name;
	public double Price;
	public int Quantity;
	
	public double TotalValueInStock() {
		return this.Quantity;
	}
	
	public void AddProducts(int quantity ) {
		this.Quantity += quantity;
	}
	
	public void RemoveProducts(int quantity) {
		this.Quantity -= quantity;
	}
	
	/*public void ShowProduct() {
		System.out.println("Product data: " + this.Name + " $ " + this.Price + ", " + this.Quantity + " units" + " Total: " + this.TotalStock());
				
	}*/
	
	public String toString() {
		return this.Name
				+ ", $ "
				+ String.format("%.2f%n", this.Price) 
				+ " , " 
				+ this.Quantity
				+ " units, Total: $ "
				+ String.format("%.2f%n", this.Price * this.Quantity);
				
	}
	
	public String TotalStock() {
		return String.format("%.2f%n", this.Price * this.Quantity);
	}

}
