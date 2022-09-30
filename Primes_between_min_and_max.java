import java.util.Scanner;
class classname
{
    public static boolean isprime(int z)
    {
        int i;
        for(i=2;i<=Math.sqrt(z);i++)
        {
            if(z%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,i,j,a[],m=9999,n=0,h=0,k=0,c=0;
        x=sc.nextInt();
        a=new int[x];
        for(i=0;i<x;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<x;i++)
        {
            if(m>a[i])
            {
                m=a[i];
                h=i;
            }
        }
        for(i=0;i<x;i++)
        {
            if(n<a[i])
            {
                n=a[i];
                k=i;
            }
        }
        if(h<k)
        {
        for(i=h;i<=k;i++)
        {
            if(a[i]==1)
            {
                continue;
            }
            else
            {
            if(isprime(a[i]))
            {
                c+=1;
            }
            }
        }
        if(c==0)
        {
             System.out.println("-1");
        }
        else
        {
             System.out.println(c);
        }
        }
        else
        {
            for(i=k;i<=h;i++)
        {
            if(a[i]==1)
            {
                continue;
            }
            else
            {
            if(isprime(a[i]))
            {
                c+=1;
            }
            }
        }
        if(c==0)
        {
             System.out.println("-1");
        }
        else
        {
             System.out.println(c);
        }
        }
    }
}