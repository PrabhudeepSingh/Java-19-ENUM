enum EnumDemo5
{
	obj1, obj2, obj3;

	EnumDemo5()
	{
		System.out.println("ENUM Consructor.");
	}
}

class Test
{
	public static void main(String[] args) 
	{
		EnumDemo5 obj = EnumDemo5.obj1;
		System.out.println("Hello.");	
	}
}