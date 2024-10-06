import java.util.Scanner;

public class s9
{
    static void fun(int a[],int sum,int idx)
    {
        if(idx==a.length)
        {
            System.out.print(sum+"  ");
            return;
        }
        int x=a[idx];
        fun(a,x+sum,idx+1);
        fun(a,sum,idx+1);
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
        fun(arr,0,0);
    }
}
