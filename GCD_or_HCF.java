import java.util.Scanner;
class gcd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i,gcd=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;i<=a&&i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            {
                gcd=i;
            }
        }
        System.out.println(gcd); 
        
    }
    
}