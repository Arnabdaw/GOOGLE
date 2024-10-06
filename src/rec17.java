import java.util.Scanner;

public class rec17
{
    static void fun(int a[],int x,int idx)
    {
        if(idx==a.length)
            return;
        if(a[idx]==x)
            System.out.print(idx+"  ");
        fun(a,x,idx+1);
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

        System.out.println("enter the number u want to search:");
        int x=obj.nextInt();
        fun(arr,x,0);


    }
}
