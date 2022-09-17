import java.util.Scanner;
class cel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float cel,far;
        far = sc.nextFloat();
        cel=((far-32)*5)/9;
        System.out.format("%.2f",cel);
        
    }
}