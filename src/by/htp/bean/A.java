package by.htp.bean;

public class A {

	static{
		System.out.println("A static bllock3");		
	}
	
	{
		System.out.println("A logic block2" );
	}
	
	static{
		System.out.println("A static bllock1");
	}
	
	static{
		System.out.println("A static bllock2");
	}
	
	public A(){
		System.out.println("A constructor()");
	}
	
	{
		System.out.println("A logic block1" );
	}

}
