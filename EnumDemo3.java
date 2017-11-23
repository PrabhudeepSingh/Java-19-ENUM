enum EnumDemo3
{
	obj1, obj2, obj3;
}

class Test
{
	public static void main(String[] args) 
	{
		EnumDemo3[] obj = EnumDemo3.values();

		for(EnumDemo3 o: obj)
		{
			System.out.println(o+" -> "+o.ordinal());
		}	
	}
}