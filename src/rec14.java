import java.util.Scanner;

public class rec14
{
    static int fun(int a[],int idx)
    {
        if(idx==a.length)
            return 0;
        int sum=fun(a,idx+1);
        return a[idx]+sum;
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
        int ans=fun(arr,0);
        System.out.println("ANS="+ans);

    }
}
