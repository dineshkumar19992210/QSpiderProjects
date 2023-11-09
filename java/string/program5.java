class program5
{
	public static void main(String[] args)
	{
		String str="developer";
		System.out.println(str.Indexof('l'));
		System.out.println(str.Indexof('o'));
		System.out.println(str.Indexof('m'));
		
		int a=str.Indexof('e');
		int b=str.Indexof('e',a+1);
		int c=str.Indexof('e',b+2);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
