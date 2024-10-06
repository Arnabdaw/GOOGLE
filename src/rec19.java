import java.util.Scanner;

public class rec19
{
    static boolean fun(int a[],int idx)
    {
        if(idx==a.length)
            return true;
        if(a[idx]<a[idx+1])
            return true;
        return fun(a,idx+1);
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
        if(fun(arr,0))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
