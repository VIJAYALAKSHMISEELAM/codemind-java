import java.util.Scanner;
class fibonacci
{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,b,c=0,k=0;
        
        n=sc.nextInt();
        a=0;
        b=1;
        System.out.print(a+" "+b+" ");
        c=a+b;
        while(k<n-2)
        {
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
            k+=1;
        }
        
    }
}