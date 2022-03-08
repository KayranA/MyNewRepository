package new1;

public class OddEven1 {

	public static void main(String[] args)
	{
		int a[] = {1,5,6,8,9,2,3};
		System.out.println("Number is Odd:");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("Number is Even:");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
	}
}
