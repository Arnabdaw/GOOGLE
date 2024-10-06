import java.util.Scanner;

public class july14d
{
    static int prefsum(int b[],int r1,int r2)
    {
        int ans;
        for (int i=1;i<b.length;i++)
        {
            b[i]=b[i]+b[i-1];
        }
        if(r1==0)
        {
            ans=b[r2];
            return ans;
        }
        ans=b[r2]-b[r1-1];
        return ans;
    }
    static int fun(int a[][],int l1,int r1,int l2,int r2)
    {
        int sum=0;
        for(int i=l1;i<=l2;i++)
        {
            sum+=prefsum(a[i],r1,r2);
        }
        return sum;
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
