import java.util.Scanner;
class monk
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
    
        int []a=new int[100];
        int []b=new int[100];
        int c;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            
        }
        for(i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
            
        }
        for(i=0;i<n;i++)
        {
            c=0;
            c=a[i]+b[i];
            System.out.print(c+" ");
            
        }
        
        
    }
    
}