import java.util.Scanner;
class carchoice
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t!=0)
      {    
        float x1,x2,y1,y2,a,b;
        x1=sc.nextInt();
        x2=sc.nextInt();
        y1=sc.nextInt();
        y2=sc.nextInt();
        a=y1/x1;
        b=y2/x2;
        if(a<b)
        {
            System.out.println("-1");
            
        }
        else if(a==b)
        {
            System.out.println("0");
        }
        else
        {
            System.out.println("1");
        }
        t-=1;
      }
    }
}