import java.util.Scanner;

public class stg2
{
    static void swapp(int[] a,int x,int y)
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
    static void bubble(int[] a)
    {
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            int flag=0;
            for(int j=0;j<n-1-i;j++)
            {
                if(a[j] > a[j+1])
                {
                    swapp(a,j,j+1);

                    flag=1;
                }
            }
            if(flag==0)
            {
                return;
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
        bubble(arr);
        pnt(arr);
    }
}

