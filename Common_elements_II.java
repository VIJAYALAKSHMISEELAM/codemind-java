import java.util.Scanner;
class common
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x,a[],b[],i,j,k=0,c=0,z=0,h=0;
        n=sc.nextInt(); 
        x=sc.nextInt(); 
        a=new int[n]; 
        b=new int[x]; 
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(j=0;j<x;j++)
        {
            b[j]=sc.nextInt();
        }
        for(i=0;i<n;i++) 
        {
            c=0; 
            k=0;
            for(j=0;j<x;j++)
            {
                if(a[i]!=b[j]) 
                {
                    c+=1;
                }
                else
                {
                    k+=1;
                }
            }
            if(k==0) 
            {
                System.out.print(a[i]+" ");
            }
        }
        for(i=0;i<x;i++)
        {
            c=0; 
            k=0;
            for(j=0;j<n;j++)
            {
                if(b[i]!=a[j])
                {
                    c+=1;
                }
                else
                { 
                    k+=1; 
                    
                } 
            
            } 
            if(k==0)
            {
                System.out.print(b[i]+" ");
            }
        }
    }

}