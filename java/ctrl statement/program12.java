class program12
{
	public static void main(String[] args)
	{
		double percentage=50;
		if(percentage>=84)
		{
			System.out.println("distinction");
		}
		else if(percentage>=65&&percentage<=85)
		{
			System.out.println("first class");
		}
		else if(percentage>=50&&percentage<=65)
		{
			System.out.println("second class");
		}
		else if(percentage>=35&&percentage<=50)
		{
			System.out.println("pass");
		}
		else 
		{
			System.out.println("fail");
		}
		
	}
}