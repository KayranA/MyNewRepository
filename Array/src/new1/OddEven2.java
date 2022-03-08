package new1;

public class OddEven2 {
	public static void main(String[] args)
	{
		
		int a[] = {11, 12 , 15 , 25 , 28 , 30 };
		
		System.out.println("Even:");
		{
		for(int i = 0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("Odd:");
		for(int i = 0 ; i<a.length; i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
	}
	}
}
