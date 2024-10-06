import java.util.Scanner;

public class rec15
{
    static boolean  fun(int a[],int x,int idx)
    {
        if(idx==a.length)
            return false;
        if(a[idx]==x)
            return true;
        return (fun(a,x,idx+1));

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
        System.out.println("enter any number:");
        int x=obj.nextInt();
        if(fun(arr,x,0))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
