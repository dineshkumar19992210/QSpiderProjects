class fibonacciseries2
{
	public static void main(String[] args)
	{
		int n=10;
		int a=1;
		int sum =0;
		while(a<=n/2)
		{
		 if(n%a==0)
		{
			sum =sum+a;
		}
		a++;
		}
		System.out.println("sum"+sum);
	}     
}