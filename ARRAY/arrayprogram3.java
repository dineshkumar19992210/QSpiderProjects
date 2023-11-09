class arrayprogram3
{
	public static  void main(String[] args)
	{
		int[] arr={15,14,13,17,16};
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum:"+sum);
	}
}