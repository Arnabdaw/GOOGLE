import java.util.Scanner;

public class stg5
{
    static void swap(int a[],int x,int y)
    {
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }

    static void pnt(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"  ");
        }
    }
    static void fun(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {
            int flag=0;
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]==0 && a[j+1]!=0)
                {
                    swap(a,j,j+1);
                    flag=1;
                }
            }
            if(flag==0)
            {
                break;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int size;
        System.out.println("enter the size of the array:");
        size=obj.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the array elements:");
        for(int i=0;i<size;i++)
        {
            arr[i]=obj.nextInt();
        }
        fun(arr);
        pnt(arr);

    }
}
