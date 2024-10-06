import java.util.Scanner;
class star2
{
    public static void main(String[] args)
    {
        int i,j,k,m,star=1,space;
        int r;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number of row(odd):");
        r=obj.nextInt();
        m=r/2;
        space=m;
        for(i=1;i<=r;i++)
        {
            if(i<=m)
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
            else
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
                star=star-2;
                space++;
            }
        }
    }
}
