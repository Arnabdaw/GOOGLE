import java.util.Scanner;
public class arrw
{
    static void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int i,size;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        size=obj.nextInt();
        int[] a=new int[size];
        System.out.println("enter the array elements:");
        for(i=0;i<a.length;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("Original Array:");
        display(a);
        int[] b=a.clone();
        System.out.println("COPIED ARRAY:");
        display(b);
        b[0]=0;
        b[1]=0;
        System.out.println("Original Array:");
        display(a);
        System.out.println("COPIED ARRAY:");
        display(b);
    }

}
