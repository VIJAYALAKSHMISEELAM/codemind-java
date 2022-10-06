import java.util.Scanner;
class fibonacci
{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,b,c=0;
        
        n=sc.nextInt();
        a=0;
        b=1;
        c=a+b;
        while(c<n)
        {
            a=b;
            b=c;
            c=a+b;
        }
        if(c==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
    }
}