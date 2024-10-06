import java.util.Scanner;

public class july13c
{
    static void swaper(int a[][],int i,int j)
    {
        int temp;
        temp=a[i][j];
        a[i][j]=a[j][i];
        a[j][i]=temp;
    }
    static void swap(int a[],int i,int j)
    {
        int temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
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

    static void tran(int a[][],int r)
    {

        for (int i = 0; i < r; i++)
        {
            for (int j = i; j < r; j++)
            {
                swaper(a,i,j);
            }
        }
    }
    static void rev(int b[])
    {
        int i=0;
        int j=b.length-1;
        while(i<j)
        {
            swap(b,i,j);
            i++;
            j--;
        }
    }
    static void ans(int a[][],int r)
    {
        tran(a,r);
        for(int i=0;i<r;i++)
        {
            rev(a[i]);
        }
    }


    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int r;
        System.out.println("enter the number of rows for 1st matrix:");
        r = obj.nextInt();

        int a[][] = new int[r][r];
        System.out.println("enter " + (r * r) + " array elements");
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                a[i][j] = obj.nextInt();
            }
        }
        System.out.println("Original Array:");
        pnt(a);
        ans(a,r);
        System.out.println("Required  Array:");
        pnt(a);
    }
}
