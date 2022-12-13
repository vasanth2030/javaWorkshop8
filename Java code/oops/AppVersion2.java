package oops;

public class AppVersion2 extends AppVersion1{
	public void function4()
	{
		System.out.println("Doing function 4");
	}
	public void function5()
	{
		System.out.println("Doing function 5");
	}
	
	//overriding
	public void function3()
	{
		System.out.println("Inside version2: ");
		super.function3();
	}
	
	//overloading
	public void function3(String value)
	{
		System.out.println("Doing function 3 with value: "+value);
	}
}
