package new1;

public class DescArrayNumberrrr {

	public static void main(String[] args) {
		int a [] = {25,22,10,45,47,57};
        int temp=0 ;
        for(int i=0; i<a.length; i++)
            {
                   for(int j= i+1; j<a.length; j++)
                      { 
                          if(a[i]>a[j])
                             {
                                     
                               }
                          else
                              {
                                   temp= a[i];
                                     a[i]=a[j];
                                      a[j]=temp;
                               }

                       }
               System.out.println(a[i]);
             }

	}

}
