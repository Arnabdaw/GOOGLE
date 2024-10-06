import java.util.Scanner;

public class rots
{
    static void swap(int arr[],int s,int e)
    {
        int temp;
        temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
    static void reverse(int a[],int s,int e)
    {
       while(s<e)
       {
           swap(a,s,e);
           s++;
           e--;
       }

    }
    static void rev(int a[],int k)
    {
        int n=a.length;
        reverse(a,0,n-k-1);
        reverse(a,n-k,n-1);
        reverse(a,0,n-1);
    }

    static void pnt(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int i, size;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        size = obj.nextInt();
        int[] a = new int[size];
        System.out.println("enter the array elements:");
        for (i = 0; i < a.length; i++)
        {
            a[i] = obj.nextInt();
        }
        System.out.println("enter the value of k:");
        int k= obj.nextInt();
        System.out.println("AFTER ROTATION BY "+k+" STEPS: ");
        rev(a,k);
        pnt(a);
    }
}
