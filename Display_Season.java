
import java.util.Scanner;
class multiply
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c;
          c=sc.nextInt();
        if(c==4 || c==5 || c==6)
        {
            System.out.print("Summer");
        }
        else if(c==7 || c==8 ||c==9 ||c==10)
        {
            System.out.print("Rainy");
        }
        else if(c==11 || c==12 || c==1)
        {
            System.out.print("Winter");
        }
        else if(c==2 || c==3)
        {
            System.out.print("Spring");
        }
        else
        {
          System.out.print("-1");  
        }
        
    }
}