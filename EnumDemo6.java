enum EnumDemo6
{
	obj1(10), obj2(20), obj3(30), obj4;

	int val;

	EnumDemo6(int val)
	{
		this.val = val;
	}

	EnumDemo6()
	{
		this.val = 40;
	}

	public int getValue()
	{
		return val;
	}
}

class Test
{
	public static void main(String[] args) 
	{
		EnumDemo6[] obj = EnumDemo6.values();

		for(EnumDemo6 o: obj)
		{
			System.out.println(o+" -> "+o.getValue());
		}	
	}
}

