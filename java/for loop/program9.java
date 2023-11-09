class program9
{
	public static void main(String[] args)
	{
		int n=5;
		char val='a';
		for(int i=0; i<5; i++)
		{
			if(i%2==0)
			{
				System.out.print(val+" ");
				val++;
			}
			else
			{
				System.out.print("*"+" ");
			}
		}
	}
}
