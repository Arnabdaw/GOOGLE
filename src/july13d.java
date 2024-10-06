import java.util.Scanner;

public class july13d
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


    static int[][] pascal(int r)
    {
        int ans[][]=new int[r][];
        for(int i=0;i<r;i++)
        {
            ans[i]=new int[i+1];
            ans[i][i]=ans[i][0]=1;
            for(int j=1;j<i;j++)
            {
                ans[i][j]=(ans[i-1][j]+ans[i-1][j-1]);
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int r;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number of rows:");
        r=obj.nextInt();
        int b[][]=pascal(r);
        pnt(b);
    }
}
