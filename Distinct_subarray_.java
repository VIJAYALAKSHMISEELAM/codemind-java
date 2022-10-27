import java.util.Scanner;
class subarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,r;
        l=sc.nextInt();
        r=sc.nextInt();
        int od=0;
        int ev=0;
        int sum=0;
        for(int i=l;i<=r;i++)
     {
        if(i%2!=0)
        {
            od+=1;
        }
        else
        {
            ev+=1;
        }
     }
     sum=(od)+(od*ev);
     System.out.println(sum);
    }
}