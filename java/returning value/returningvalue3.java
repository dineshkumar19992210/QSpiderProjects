class returningvalue3
{
	static char disp()
	{
		return 'd';
	}
	public static void main(String[] args)
	{
		char ch =disp();
		System.out.println(ch);
		System.out.println(disp());
	}
}