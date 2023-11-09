
public class objectclassex1 {
	String name;
	int price;
	String color;
	int yom;
	
	
	public car(String name,int price,String color,int yom) {
		
		this.name=name;
		this.price=price;
		this.color=color;
		this.yom=yom;
		
	}
	public String toString()
	{
		return this.name+""+this.price+""+this.color+""+this.yom;
	}
	public boolean equals(object obj)
	{
		car c=(car)obj;
		return this.yom==c.yom;
	}

	}
	
	

}
