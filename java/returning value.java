class returningvalue1
{
	static int test()
	{
		return 45;
	}
	public static void main(String[] args)
	{
		int val =test();
		System.out.println(val);
		System.out.println(test());
	}
}