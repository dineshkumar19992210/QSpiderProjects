class program5
{
	public static void main(String[] args)
	{
		int a=13;
		int b=17;
		int c=a++ +b-- +a++ +b--;
		System.out.println(c);
		
		int x=15;
		int y=12;
		int z=x-- + y++ +x-- +y++;
		System.out.println(z);
	}
}