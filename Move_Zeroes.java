import java.util.Scanner;
class Movezeros
{
    public static void main(String args[])
    {
        Scanner  sc=new Scanner(System.in);
        int n,c=0;
        int temp;
        
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n-1;j++)
        {
            if(a[j]==0)
            {
                c+=1;
            }
        }
        while(c>0)
      {
        for(int j=0;j<n-1;j++)
        {
            if(a[j]==0)
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
        c-=1;
      }
        for(int j=0;j<n;j++)
        {
            System.out.print(a[j]+" ");
        }
        
    }
}