class program11
{
	public static void main(String[] args)
	{
		char ch='A';//'m','n','5'
		if(ch>='A'&&ch<='Z')
		{
			System.out.println("uppercase");
		}
		else if(ch>='a'&&ch<='z')
		{
			System.out.println("lowercase");
		}
		else if(ch>='0'&&ch<='9')
		{
			System.out.println("normal");
		}
		else
		{
			System.out.println("specal char");
		}
	}
}