import java.util.Scanner;
class tribo
{
    void tri(int n)
    {
        int a=0,b=1,c=2,d;
        for(int i=1;i<=n;i++)
        {
            System.out.print(a+"  ");
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
    }
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int terms;
        System.out.println("enter the number of terms:");
        terms=obj.nextInt();
        tribo ob=new tribo();
        ob.tri(terms);
    }
}
