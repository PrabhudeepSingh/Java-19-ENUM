enum EnumDemo2
{
	obj1, obj2, obj3;
}

class Test
{
	public static void main(String[] args) 
	{
		EnumDemo2 obj = EnumDemo2.obj1;
		
		switch(obj)
		{
			case obj1: System.out.println("This is object1");
					   break;

			case obj2: System.out.println("This is object2");
					   break;

			case obj3: System.out.println("This is object3");
					   break;

			//case xyz: -> CE: unqualfied enumeration.
		}	
	}
}