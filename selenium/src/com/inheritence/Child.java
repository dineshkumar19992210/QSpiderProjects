package com.inheritence;

public class Child extends Parent{
	
	public static void main(String[] args) {
				
		Child child=new Child();
		child.hic();
		child.hello();
		
		Parent parent=new Parent() ;
		parent.hi();
		
	}
	
	public void hic() {
		hi();
	}

	public void hello() {
		System.out.println("hello From Child Class");
	}
	
	
}
