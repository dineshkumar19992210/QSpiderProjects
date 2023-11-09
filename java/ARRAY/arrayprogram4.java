class arrayprogram4
{
	public static  void main(String[] args)
	{
		int[] arr={15,14,13,17,16};
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		int avg=sum/arr.length;
		System.out.println(avg);
	}
}