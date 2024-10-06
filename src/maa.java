import java.util.Scanner;

class maa
{
    public static void main(String[] args)
    {
        int i,j,k,star=1,space;
        int r;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number of row:");
        r=obj.nextInt();
        space=r-1;
        for(i=1;i<=r;i++)
        {
            for(j=1;j<=space;j++)
            {
                System.out.print("  ");
            }
            for(k=1;k<=star;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
            star=star+2;
            space--;
        }
    }
}
