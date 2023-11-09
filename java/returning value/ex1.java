class ex1
{
	static boolean verifyspeed(int speed)
	{
		if(speed>=65)
		{
			
         return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args)
	{
		System.out.println(verifyspeed(64));
		System.out.println(verifyspeed(76));
	}
}
			 
