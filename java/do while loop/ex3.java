class ex3
{
	public static void main(String[] args)
	{
		int num=1221;
		int rev=0;
		int copy=num;
		
		while(num>0)
		{
		 int t=num%10;
		 rev =rev*10+t;
		 num =num/10;
		 }
		 
		if(rev==copy)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not polindrome");
		}
		
	}
}