import java.util.Scanner;

public class july12c
{
    static void multi(int[][]a,int b[][],int r1,int r2,int c1,int c2)
    {
        if(c1!=r2)
        {
            System.out.println("multiplication not possible");
            return;
        }
        int c[][]=new int[r1][c2];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                int sum=0;
                for(int k=0;k<c1;k++)
                {
                    sum=sum+(a[i][k]*b[k][j]);
                }
                c[i][j]=sum;
            }
        }
        System.out.println("MULTIPLICATION=");
        pnt(c);
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
        multi(a,b,r1,r2,c1,c2);
    }
}
