class program8
{
	public static void main(String[] args)
	{
		int n=5;
		int val=1;
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
