
public class Fruit {
	
    protected String name;
 
    public Fruit(String name) {
    this.name = name;  
	}

    //overriding
    public String toString() { 
        return name ;
    }
    
    //main
	public static void main(String[] args) {
		System.out.println("\t+========Welcome======+");
		Fruit a = new Fruit("\t Apple : Grape : Mango");
		System.out.println(a);
		System.out.println();
		
		Apple b = new Apple("Apple", "Sweet");
		System.out.println(b);
		System.out.println();
		
		RedApple e = new RedApple ("RedApple","Sweet", 20);
		e.Calcprice();
		e.Calcprice(3);
		e.Calprice(0, "Fresh Fruit");
		System.out.println(e);
		System.out.println();
		
		grape c = new grape("grape", 19);
		c.Calcprice();
		c.Calcprice(2);
		c.Calprice(0, "Fresh Fruit");
		System.out.println(c);
		System.out.println();
		
		Mango d = new Mango("Mango", 17);
		d.Calcprice();
		d.Calcprice(2);
		d.Calprice(0, "Fresh Fruit");
		System.out.println(d);
		System.out.println("\t+============End============+");
		
	}

}
