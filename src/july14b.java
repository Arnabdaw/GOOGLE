import java.util.Scanner;

public class july14b
{
    static void pnt(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static int[][] spiral(int n)
    {
        int ans[][]=new int[n][n];
        int tr=0,br=n-1,lc=0,rc=n-1;
        int k=1;
        int x=n*n;
        while(k<=x)
        {
            for(int j=lc;j<=rc && k<=x;j++)
            {
                ans[tr][j]=k;
                k++;
            }
            tr++;
            for(int i=tr;i<=br && k<=x;i++)
            {
                ans[i][rc]=k;
                k++;
            }
            rc--;
            for(int j=rc;j>=lc && k<=x;j--)
            {
                ans[br][j]=k;
                k++;
            }
            br--;
            for(int i=br;i>=tr;i--)
            {
                ans[i][lc]=k;
                k++;
            }
            lc++;
        }
        return (ans);
    }
    public static void main(String[] args)
    {
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a positive integer:");
        n=obj.nextInt();
        int sol[][]=spiral(n);
        pnt(sol);
    }
}
