import java.util.Scanner;
class difference
{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,i;
        
        n=sc.nextInt();
        r=sc.nextInt();
        for(i=1;i<=r;i++)
        {
            if(i%2==0)
            {
                continue;
            }
            else
            {
                System.out.print(n + " " );
                 System.out.print("x" + " " );
                System.out.print(i + " " );
                System.out.print("=" + " " );
                 System.out.print(n*i);
                 System.out.println();
                
            }
        }
        
    }
}