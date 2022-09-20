import java.util.Scanner;
class smaller
{
    public static int is_it_prime(int l)
    {
        int j;
        for(j=2;j<=Math.sqrt(l);j++)
        {
            if(l%j==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i,k,c=0,t;
        int []a= new int[100];
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
             if(a[i]<=k)
             {
                if(a[i]==1)
                {
                    continue;
                }
                else
                {
                    t=is_it_prime(a[i]);
                 if(t==1)
                  {
                    c+=1; 
                  }
                 
                }
                
             }
        }
        System.out.println(c);
    }
}