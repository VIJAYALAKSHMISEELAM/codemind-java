import java.util.Scanner;
class classanme
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],a,b,i,j=1,k=0;
        n=sc.nextInt();
        arr=new int[100];
        while(n!=0)
        {
            n-=1;
            a=sc.nextInt(); 
            j=(a*(a+1))/2;
            for(i=0;i<a-1;i++) 
            {
                arr[i]=sc.nextInt();
            } 
            for(i=0;i<a-1;i++)
            {
                k=k+arr[i]; 
                
            }
            b=j-k;
            System.out.println(b);
            k=0;
        }
    }

}