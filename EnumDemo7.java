enum EnumDemo7
{
	BLUE, RED, GREEN;

	public void info()
	{
		System.out.println("Universal Color");
	}
}

class Test
{
	public static void main(String[] args) 
	{
		EnumDemo7[] obj = EnumDemo7.values();

		for(EnumDemo7 o: obj)
		{
			o.info();
		}	
	}
}