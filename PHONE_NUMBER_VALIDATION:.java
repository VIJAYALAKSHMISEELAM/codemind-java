import java.util.Scanner;
class mobile
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String num=sc.nextLine();
        if(num.length()!=10)
        {
            System.out.println("Invalid");
        }
        else if(num.charAt(0)=='0')
        {
            System.out.println("invalid");
        }
        else
        {
            System.out.println("Valid");
        }
    
        
    }
}