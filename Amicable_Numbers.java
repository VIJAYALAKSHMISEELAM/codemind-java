import java.util.Scanner;
class amicable
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,s1=0,s2=0,i;
        m=sc.nextInt();
        n=sc.nextInt();
        for(i=1;i<m;i++)
        {
            if(m%i==0)
            {
                s1+=i;
            }
        }
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s2+=i;
            }
        }
        if(s1==n && s2==m)
        {
            System.out.println("Amicable");
        }
        else
        {
            System.out.println("Not Amicable");
        }
    }
}
