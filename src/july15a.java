import java.util.Scanner;

public class july15a
{
    static void prefsum(int b[][])
    {
        for (int i=0;i<b.length;i++)
        {
            for(int j=1;j<b[i].length;j++)
            {
                b[i][j]=b[i][j]+b[i][j-1];
            }
        }
    }

    static void colsum(int b[][])
    {
        int c=b[0].length;
        for (int j=0;j<c;j++)
        {
            for(int i=1;i<b.length;i++)
            {
                b[i][j]=b[i][j]+b[i-1][j];
            }
        }
    }

    static int fun(int a[][],int l1,int r1,int l2,int r2)
    {
        int sum=0,ans=0,up=0,left=0,leftup=0;
        prefsum(a);
        colsum(a);

        sum=a[l2][r2];
        if(l1>=1)
        {
            up=a[l1-1][r2];
        }
        if(r1>=1)
        {
            left=a[l2][r1-1];
        }
        if(l1>=1 && r1>=1)
        {
            leftup=a[l1-1][r1-1];
        }
        ans=sum-up-left+leftup;
        return ans;
    }
    public static void main(String[] args)
    {
        int r,c,l1,l2,r1,r2;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number of row:");
        r=obj.nextInt();
        System.out.println("enter the number of column:");
        c=obj.nextInt();

        int a[][]=new int[r][c];
        System.out.println("enter the array elements:");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=obj.nextInt();
            }
        }
        System.out.println("enter the first coordinates:");
        l1=obj.nextInt();
        r1=obj.nextInt();
        System.out.println("enter the second coordinates:");
        l2=obj.nextInt();
        r2=obj.nextInt();

        int sol=fun(a,l1,r1,l2,r2);
        System.out.println("ANS="+sol);
    }
}
