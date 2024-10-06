import java.util.Scanner;

public class july9b
{
    static void fun(int a[])
    {
        int i,j;
        i=0;
        j=a.length-1;
        while(i<j)
        {
            if(a[i]%2==1 && a[j]%2==0)
            {
                swap(a,i,j);
                i++;
                j--;
            }
            else if (a[i]%2==0)
            {
                i++;
            }
            else
            {
                j--;
            }
        }
    }
    static void swap(int arr[], int s, int e)
    {
        int temp;
        temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
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
