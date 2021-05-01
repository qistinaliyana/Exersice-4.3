
public class grape extends Fruit {
    	private double price;
    	public grape (String name, double price) {
    		super(name);
 
    		this.price = price;
    	}
    	//overloading
    	public void Calcprice() {  //without arguments
    		System.out.println("\tThe price is : RM " + this.price);	
    	}
    	public void Calcprice(double weight) {// with 1 arguments
    		System.out.println("\tThe weight is : " + weight + "kg");	
    	}
    	public double Calprice(double Totalprice, String c) { //with 2 arguments
    		Totalprice = 3 * this.price;
    		System.out.println("\tThe total price is : RM " + Totalprice + "\n\tThe condition is : " + c);
    		return Totalprice;
    	}
    	//getter
    	public double getprice() {
    		return this.price;
    	}
    	//overriding
    	public String toString() {
			return "\tThe Fruit is : " + name ;
    	}
}
