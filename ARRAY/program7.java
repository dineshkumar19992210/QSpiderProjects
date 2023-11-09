class program7
{
	
public static void main(String[] args)
{
	int[] arr={13,18,15,10,17};
	System.out.println("before sorting");
	for(int i=0;i<arr.length;i++){
	System.out.println(arr[i]);
}
for(inti=0;i<arr.length;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
	if(arr[i]>arr[j])
	{
		int t=arr[i];
		arr[i]=arr[j];
		arr[j]=t;
	}
	}
}
  System.out.println("after sortin");
  for(int i=0;i<arr.length;i++){
  System.out.println(arr[i]);
  }
}

  
}


