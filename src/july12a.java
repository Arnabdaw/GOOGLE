import java.util.Scanner;

public class july12a
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
    }
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int r,c;
        System.out.println("enter the number of rows:");
        r=obj.nextInt();
        System.out.println("enter the number of columns:");
        c=obj.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("enter "+(r*c)+" array elements:");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=obj.nextInt();
            }
        }
        pnt(arr);
    }
}
