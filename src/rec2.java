import java.util.Scanner;

public class rec2
{
    static void fun(int n)
    {
        if(n==1)
        {
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        fun(n-1);
    }
    public static void main(String[] args)
    {
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter any number:");
        n=obj.nextInt();
        fun(n);
    }
}
