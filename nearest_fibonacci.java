import java.util.*;
class fibo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,n;
        n=sc.nextInt();
        int bef=0,nex=0,bef1=0,nex1=0;
        a=0;
        b=1;
        c=a+b;
        while(c<n)
        {
            bef=c;
            a=b;
            b=c;
            c=a+b;
        }
        nex=c;
        if(c==n)
        {
            System.out.println(n);
        }
        else
        {
            bef1=Math.abs(bef-n);
            nex1=Math.abs(nex-n);
            if(bef1>nex1)
            {
                System.out.println(nex);
            }
            else if(bef1<nex1)
            {
                System.out.println(bef);
            }
            else
            {
                System.out.println(bef + " " + nex);
                
            }
        }
        
    }
}