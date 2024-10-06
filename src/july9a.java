import java.util.Scanner;

public class july9a
{
    static void swap(int arr[], int s, int e)
    {
        int temp;
        temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }

    static void fun(int a[])
    {
        int l, r;
        l = 0;
        r = a.length - 1;
        while (l < r)
        {
            if (a[l] ==1  && a[r] == 0)
            {
                swap(a, l, r);
                l++;
                r--;
            }
            else if (a[l]==0)
            {
                l++;
            }
            else if (a[r]==1)
            {
                r--;
            }
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