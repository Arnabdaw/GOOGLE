import java.util.Scanner;

public class july9d
{
    static void fun(int a[])
    {
//        int j=0;
        int i=1;
       while(i<a.length)
        {
            a[i]=(a[i]+a[i-1]);
            i++;
//            j++;
        }
    }
    static void pnt(int a[])
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + "  ");
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
