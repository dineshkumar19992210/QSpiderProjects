
	class arrayprogram5
{
	public static  void main(String[] args)
	{
		int[] arr={15,14,13,17,16};
		
		int large=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>large)
			{
				large=arr[i];
			}
			
		}
		
		System.out.println(large);
	}
}