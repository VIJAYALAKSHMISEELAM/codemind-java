import java.util.Scanner;
class close
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,temp,k=0,z=0,d;
        n=sc.nextInt();
        for(i=n-1;i>=1;i--)
        {
            temp=i;
            k=0;
            while(temp!=0)
            {
                d=temp%10;
                temp=temp/10; 
                k=k*10+d; 
            
            }
            if(k==i)
            {
                break;
            }
        }
        for(i=n+1;i<=n+10000;i++)
        {
            temp=i;
            z=0;
            while(temp!=0) 
            { 
                d=temp%10;
                temp=temp/10; 
                z=z*10+d;
            }
            if(z==i)
            {
                break;
            }
        }
        if((z-n)>(n-k))
        {
            System.out.println(k); 
        
        } 
        else if((z-n)==(n-k))
        {
            System.out.print(k+" ");
            System.out.print(z);
        }
        else
        {
            System.out.println(z);
        }
    }
    
}