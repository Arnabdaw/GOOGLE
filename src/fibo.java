import java.util.Scanner;
class fibo
{
    void fib(int n)
    {
        int a=0,b=1,c;
        for(int i=1;i<=n;i++)
        {
            System.out.print(a+"  ");
            c=a+b;
            a=b;
            b=c;
        }

    }
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int terms;
        System.out.println("enter the number of terms:");
        terms=obj.nextInt();
        fibo ob=new fibo();
        ob.fib(terms);
    }
}
