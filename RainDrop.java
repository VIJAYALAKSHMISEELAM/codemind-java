import java.util.Scanner;
class grade
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        if(a%3==0 )
        {
            
            System.out.print("Pling");
        }
         if(a%5==0)
        {
            System.out.print("Plang");
        }
         if(a%7==0)
        {
            System.out.println("Plong");
        }
        if(a%7!=0 && a%3!=0 && a%5!=0)
        {
            System.out.print(a);
        }
    }
}