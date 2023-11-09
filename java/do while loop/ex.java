class ex
{
	public static void main(String[] args)
	{
		int num=59988;
		int count=0;
		do
		{
			count++;
			num =num/10;
		}
		while(num>0);
		System.out.println("count"+count);
	}
}