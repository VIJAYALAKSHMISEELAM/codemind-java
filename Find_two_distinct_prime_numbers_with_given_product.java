import java.util.Scanner;
class product
{
    public static boolean is_it_prime(int i) 
    {
        int j;
        for(j=2;j<=(int)Math.sqrt(i);j++)
        {
            if(i%j==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k=0,i,j,c=0;
        
        n=sc.nextInt();
        int a[]=new int[100];
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                if(is_it_prime(i))
                {
                    a[k]=i;
                    k+=1;
                }
            }
        }
        for(i=0;i<=k;i++)
        {
           for(j=i+1;j<=k;j++)
           {
               if(a[i]*a[j]==n)
               {
                   c=1;
                   System.out.println(a[i]+" "+a[j]);
                   break;
               }
           }
        }
        if(c==0)
        {
            System.out.println("-1");
        }
    }
}