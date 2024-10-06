import java.util.Scanner;

public class july14a
{
    static void pnt(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void spiral(int a[][],int r,int c)
    {
        int tr=0,br=r-1,lc=0, rc=c-1;
        int total=0;
        while(total<(r*c))
        {
            for(int j=lc;j<=rc && total<(r*c) ;j++)
            {
                System.out.print(a[tr][j]+" ");
                total++;
            }
            tr++;

            for(int i=tr;i<=br && total<(r*c);i++)
            {
                System.out.print(a[i][rc]+" ");
                total++;
            }
            rc--;

            for(int j=rc;j>=lc && total<(r*c);j--)
            {
                System.out.print(a[br][j]+" ");
                total++;
            }
            br--;

            for(int i=br;i>=tr && total<(r*c);i--)
            {
                System.out.print(a[i][lc]+" ");
                total++;
            }
            lc++;
        }
    }

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int r,c;
        System.out.println("enter the number of rows for 1st matrix:");
        r = obj.nextInt();
        System.out.println("enter the number of columns for 1st matrix:");
        c = obj.nextInt();
        int a[][] = new int[r][c];
        System.out.println("enter " + (r * c) + " array elements");
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                a[i][j] = obj.nextInt();
            }
        }
        pnt(a);
        spiral(a,r,c);
        System.out.println();

    }
}
