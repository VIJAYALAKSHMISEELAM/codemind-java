import java.util.Scanner;
class classanme
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,a[],b[],c=0,z=0,i,j;
        a=new int[10];
        b=new int[10]; 
        for(i=1;i<=3;i++) 
        {
            a[i]=sc.nextInt();
        }
        for(j=1;j<=3;j++)
        {
            b[j]=sc.nextInt(); 
            
        }
        for(i=1;i<=3;i++) 
        {
            for(j=1;j<=3;j++)
            {
                if(i==j)
                {
                    if(a[i]>b[j])
                    {
                        c++;
                    }
                    else if(a[i]<b[j])
                    {
                        z++; 
                        
                    }
                }
            }
        }
        System.out.print(c+" ");
        System.out.print(z+" ");
    }
    
}