import java.util.Scanner;
class Max
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n,i,j,c,max;
    
           n=sc.nextInt();
           int a[]=new int[n];
           int temp[]=new int[100];
         for(i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    a[j]=-j;
                    a[i]=-i;
                    break;
                }
            }
        }
        
       int k=0;
        for(i=0;i<n;i++)
         {
             if(a[i]>0)
             {
                 temp[k]=a[i];
                 k++;
             }
         }
         if(k<=1)
         {
             System.out.print("-1");
         }
       else
        {    max=temp[0];
             for(i=0;i<=k;i++)
           {
             if(temp[i]>max)
             {
                 max=temp[i];
             }
           }
         System.out.print(max);
        } 
    }
}