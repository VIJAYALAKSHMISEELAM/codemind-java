import java.util.Scanner;
class triangle
{
 public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a,b;
    float Ave;
    a=sc.nextInt();
    b=sc.nextInt();
    Ave=(float)(a+b)/2;
   
    System.out.format("%.4f",Ave);
  }
}
   