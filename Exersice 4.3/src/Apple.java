
public class Apple extends Fruit {
    private String taste;
	
	public Apple(String name, String taste) {
	super(name);
	this.taste = taste;
	}
	//getter
	public String gettaste() {
		return this.taste;
	}
	//overriding
	public String toString() {
		return "\tThe Fruit is: " + name + "\n\tthe taste is : " + taste ;
	}
    	
}
