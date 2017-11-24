enum EnumDemo8
{
	BLUE, RED{ 
			public void info()
			{
				System.out.println("Dangerous Color");
			}
		}, GREEN;

	public void info()
	{
		System.out.println("Universal Color");
	}
}

class Test
{
	public static void main(String[] args) 
	{
		EnumDemo8[] obj = EnumDemo8.values();

		for(EnumDemo8 o: obj)
		{
			o.info();
		}	
	}
}