import java.util.Scanner;

public class july13a
{
    static int[][] tran(int a[][],int r,int c)
    {
        int ans[][]=new int[c][r];
        for (int i = 0; i < c; i++)
        {
            for (int j = 0; j < r; j++)
            {
                ans[i][j]=a[j][i];
            }
        }
        return ans;
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
        int ans[][]=tran(a, r1, c1);
        System.out.println("Transpose Array:");
        pnt(ans);
    }
}
