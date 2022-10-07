import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x,a[],b[],i,j,k[],c=0,z=0,h=0; 
        n=sc.nextInt();
        x=sc.nextInt(); 
        a=new int[n];
        b=new int[x];
        k=new int[n+x]; 
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
            for(j=0;j<x;j++)
            {
                if(a[i]==b[j])
                {
                    b[j]=-1;
                    c+=1;
                }
            }
            if(c>=1)
            { 
                h+=1;
            }
        }
        System.out.println(h);
    }
    
}