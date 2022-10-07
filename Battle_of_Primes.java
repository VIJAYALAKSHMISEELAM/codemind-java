import java.util.Scanner;
class classname
{
    public static boolean prime(int i)
    {
        int j;
        for(j=2;j<i;j++)
        {
            if(i%j==0) 
            {
                return false;
            }
            
        
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i,j,n,k;
        a=sc.nextInt();
        b=sc.nextInt();
        k=a+b;
        for(i=1;i<10;i++) 
        {
            n=k+i; 
            if(prime(n)) 
            {
                System.out.println(i);
                break; 
            
            }
        }
    }
    
}