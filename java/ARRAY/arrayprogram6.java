
	class arrayprogram6
{
	public static  void main(String[] args)
	{
		int[] arr={15,14,13,17,16};
		
		int small=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<small)
			{
				small=arr[i];
			}
			
		}
		
		System.out.println(small);
	}
}