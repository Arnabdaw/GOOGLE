import java.util.Scanner;

public class stg3
{
    static void insertion(int[] a)
    {
        int n=a.length;
        for(int i=1;i<n;i++)
        {
            int j=i-1;
            int x=a[i];
            while(j>-1 && a[j]>x)
            {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=x;
        }
    }
    static void pnt(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"  ");
        }
    }
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=obj.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        insertion(arr);
        pnt(arr);
    }
}
