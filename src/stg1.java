import java.util.Scanner;

public class stg1
{
    static void swap(int[] a,int x,int y)
    {
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    static void pnt(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"  ");
        }
    }
    static void selection(int a[])
    {
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[min]>a[j])
                {
                    min=j;
                }
            }
            if(min!=i)
            {
                swap(a,min,i);
            }
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
        selection(arr);
        pnt(arr);
    }
}
