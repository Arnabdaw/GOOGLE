import java.util.Scanner;

public class rec1
{
     static void pi(int n)
    {
        if(n==1)
        {
            System.out.print(n+" ");
            return;
        }
        else
        {
            pi(n-1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int n;
        System.out.println("enter any number:");
        n=obj.nextInt();
        pi(n);
    }
}
