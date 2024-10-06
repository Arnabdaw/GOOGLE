import java.util.Scanner;

public class july12b
{
    static void add(int[][]a,int b[][],int r1,int r2,int c1,int c2)
    {
        if(r1!=r2 || c1!=c2)
        {
            System.out.println("addition not possible");
            return;
        }
        int sum[][]=new int[r1][c1];
        for(int i=0;i<sum.length;i++)
        {
            for(int j=0;j<sum[i].length;j++)
            {
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("SUM=");
        pnt(sum);
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
        Scanner obj=new Scanner(System.in);
        int r1,c1,r2,c2;
        System.out.println("enter the number of rows for 1st matrix:");
        r1=obj.nextInt();
        System.out.println("enter the number of columns for 1st matrix:");
        c1=obj.nextInt();
        int a[][]=new int[r1][c1];
        System.out.println("enter "+(r1*c1)+" array elements");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=obj.nextInt();
            }
        }


        System.out.println("enter the number of rows for 2nd matrix:");
        r2=obj.nextInt();
        System.out.println("enter the number of columns for 2nd matrix:");
        c2=obj.nextInt();
        int b[][]=new int[r2][c2];
        System.out.println("enter "+(r2*c2)+" array elements");
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                b[i][j]=obj.nextInt();
            }
        }
        pnt(a);
        pnt(b);
        add(a,b,r1,r2,c1,c2);
    }
}
