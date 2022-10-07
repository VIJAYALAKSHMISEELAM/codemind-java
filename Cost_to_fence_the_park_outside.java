import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,b,w,ar,c,A,a;
        l=sc.nextInt();
        b=sc.nextInt(); 
        w=sc.nextInt(); 
        c=sc.nextInt();
        A=l*b;
        a=(l+2*w)*(b+2*w);
        ar=a-A;
        ar=ar*c;
        System.out.println(ar); 
        
    }
    
}