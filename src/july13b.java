import java.util.Scanner;

public class july13b
{
    static void swaper(int a[][],int i,int j)
    {
        int temp;
        temp=a[i][j];
        a[i][j]=a[j][i];
        a[j][i]=temp;
    }
    static void tran(int a[][],int r,int c)
    {

        for (int i = 0; i < c; i++)
        {
            for (int j = i; (j < r); j++)
            {
                    swaper(a,i,j);
            }
        }
    }
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

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int r1, c1, r2, c2;
        System.out.println("enter the number of rows for 1st matrix:");
        r1 = obj.nextInt();
        System.out.println("enter the number of columns for 1st matrix:");
        c1 = obj.nextInt();
        int a[][] = new int[r1][c1];
        System.out.println("enter " + (r1 * c1) + " array elements");
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                a[i][j] = obj.nextInt();
            }
        }

        pnt(a);
        tran(a, r1, c1);
        System.out.println("Transpose Array:");
        for(int i=0;i<c1;i++)
        {
            for(int j=0;j<r1;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
