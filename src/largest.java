import java.util.Scanner;

public class largest
{
    int lar(int a[])
    {
        int max,i;
        max=a[0];
        for(i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        int max,size,i;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        size=obj.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the array elements:");
        for(i=0;i<size;i++)
        {
            arr[i]=obj.nextInt();
        }
        largest ob=new largest();

        max=ob.lar(arr);
        System.out.println("Largest element: "+max);
    }
}
