import java.util.Scanner;

public class recn
{
    static int fun(int n)
    {
        if(n==0)
            return 1;
        return n*fun(n-1);
    }
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=obj.nextInt();
        int fact=fun(n);
        System.out.println("Factorial of "+n+ " is :"+fact);
    }
}
