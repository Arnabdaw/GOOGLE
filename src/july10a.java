import java.util.Scanner;

public class july10a
{
    static void prefsum(int a[])
    {
        int i=1;
        while(i<a.length)
        {
            a[i]=(a[i]+a[i-1]);
            i++;
        }
    }
    static int sum(int a[],int l,int r)
    {
        int z=a[r]-a[l-1];
        return z;
    }
    static void fun(int a[])
    {
        Scanner ob=new Scanner(System.in);
        int q,l,r;
        System.out.println("enter the number of queries:");
        q=ob.nextInt();
        prefsum(a);
        for(int i=1;i<=q;i++)
        {
            System.out.println("left index:");
            l=ob.nextInt();
            System.out.println("right index:");
            r=ob.nextInt();
            int ans=sum(a,l,r);
            System.out.println("SUM="+ans);
        }
    }
    public static void main(String[] args)
    {
        int i, size;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        size = obj.nextInt();
        int[] arr = new int[size+1];
        System.out.println("enter the array elements:");
        for (i = 1; i <= size; i++)
        {
            arr[i] = obj.nextInt();
        }
        fun(arr);
//        System.out.println("sorted array:");

    }
}
