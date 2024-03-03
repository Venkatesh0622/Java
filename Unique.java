package Java;


public class Unique 
{
   
    public static void main(String[] args) 
	{
		int []arr= {5,0,1,0,3,5,3,2,2};
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			boolean flag=true;
			for(int j=0;j<size;j++)
			{
				if(i!=j)
				{
					if(arr[i]==arr[j])
					{
						flag=false;
						break;
					}
				}
			}
			if(flag==true)
			{
				System.out.println(arr[i]+" is the Unique Element");
				return;
			}
		}
	}
    
}
