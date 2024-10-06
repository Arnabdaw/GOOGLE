import java.util.Scanner;

public class rec9
{
    static void fun(int n,int k)
    {

        if(k==0)
        {
            return;
        }
        fun(n,k-1);
        System.out.print(n*k+" ");

    }
    public static void main(String[] args)
    {
        int num,k;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a number:");
        num=obj.nextInt();
        System.out.println("enter the vakue of k:");
        k=obj.nextInt();
        fun(num,k);
    }
}
