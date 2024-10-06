import java.util.Scanner;

public class july9
{
    static void fun(int a[])
    {
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                count++;
            }
        }
        for(int i=0;i<count;i++)
        {
            a[i]=0;
        }
        for(int i=count;i<a.length;i++)
        {
            a[i]=1;
        }
    }
    static void pnt(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"  ");
        }
    }

    public static void main(String[] args)
    {
        int i, size;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        size = obj.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the array elements:");
        for (i = 0; i < arr.length; i++)
        {
            arr[i] = obj.nextInt();
        }
        fun(arr);
        System.out.println("sorted array:");
        pnt(arr);
    }
}
