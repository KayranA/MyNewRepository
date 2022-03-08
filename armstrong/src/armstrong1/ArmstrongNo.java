package armstrong1;

public class ArmstrongNo {

	public static void main(String[] args) {
		
            int no = 371;
            int i = no;
            int sum = 0;
            int n;
           
            while ( i >0)
            {
            	n = i % 10 ; // n= 1 , 7, 3
            	i = i / 10 ;  // i =37, 3, 0 
            	sum = sum + (n*n*n*n);
            }
            if (sum == no)
            {
            	System.out.println(no + " is Armstrong Number");
            }
            else
            {
            	System.out.println(no + " is not Armstrong Number");
            }
		
		
	}

}
