import java.util.Scanner;

public class rec12
{
//    static void fun(int[] a,int n)
//    {
//        if(n==1)
//        {
//            System.out.print(a[n-1]+"  ");
//            return;
//        }
//        fun(a,n-1);
//        System.out.print(a[n-1]+"  ");
//    }

    static void fun(int[] a,int idx)
    {
        if(idx==a.length)
            return;
        System.out.print(a[idx]+" ");
        fun(a,idx+1);
    }

    public static void main(String[] args)
    {
        int size;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        size=obj.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the array elements:");
        for(int i=0;i<size;i++)
        {
            arr[i]=obj.nextInt();
        }
        fun(arr,0);
    }
}
