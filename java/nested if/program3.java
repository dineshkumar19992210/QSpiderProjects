class program3
{
	public static void main(String[] args)
	{
		double accbal=10000;
		int amt =15000;
		if(amt<=accbal)
		{
			if(amt%100==0)
			{
				System.out.println("withdraw succes");
			}
			else
			{
				System.out.println("invalid demonization");
			}
		}
		else
		{
			System.out.println("insfficient balance");
		}
	}
}
