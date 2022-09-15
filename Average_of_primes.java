import java.util.Scanner;
class average
{
    public static int is_it_prime(int k)
    {
        int j;
        for(j=2;j<=Math.sqrt(k);j++)
        {
            if(k%j==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i,t;
        float res;
        n=sc.nextInt();
        i=0;
    
        int []a=new int[100];
        int sum=0,c=0;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]==0 || a[i]==1)
            {
                continue;
            }
            else
            {
                t=is_it_prime(a[i]);
                if(t==1)
                {
                    sum+=a[i];
                    c+=1;
                }
            }
        }
        res=(float)sum/c;
        System.out.printf("%.2f",res);
        
    }
    
}