import java.util.Scanner;

public class arr3
{
    static int cnt(int[] a,int t)
    {
        int i,j;
        int count=0;
        int b[][]=new int[100][2];
        for(i=0;i<a.length-1;i++)
        {
            for(j=i+1;j<a.length;j++)
            {
                if(a[i]+a[j]==t)
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        int x,y,size;
        Scanner obj=new Scanner(System.in);

        System.out.println("enter the size of the array: ");
        size=obj.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the array elements:");
        for(int i=0;i<size;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println("enter the target sum:");
        x=obj.nextInt();
        y=cnt(arr,x);
        System.out.println("total pairs="+y);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
