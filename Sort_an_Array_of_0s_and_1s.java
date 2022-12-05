import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,a[],k[],m,x[],y[],j=0,z=0;
        n=sc.nextInt();
        a=new int[n];
        y=new int[n];
        x=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==1)
            {
                x[j]=a[i];j+=1;
                
            }
            
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                y[z]=a[i];
                z+=1;
                
            }
            
        }
        for(i=0;i<z;i++)
        {
            System.out.print(y[i]+" ");
            
        }
        for(i=0;i<j;i++)
        {
            System.out.print(x[i]+" ");
            
        }
        
    }
    
}