import java.util.Scanner;
class maxx
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],i=0,j,d;
        n=sc.nextInt();
        a=new int[100];
        while(n!=0) 
        {
            d=n%10; 
            n=n/10; 
            a[i]=d;
            i++;
        }
        for(j=i;j>=0;j--)
        {
            if(a[j]==6) 
            {
                a[j]=9;
                break;
            }
        }
        for(j=i-1;j>=0;j--)
        {
            System.out.print(a[j]);
        }
    }
    
}