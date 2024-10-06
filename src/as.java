import java.util.Scanner;

public class as
{
    static int[] frequency(int arr[])
    {
        int fq[]=new int[10003];
        for(int i=0;i<arr.length;i++)
        {
            fq[arr[i]]++;
        }
        return fq;
    }
    public static void main(String[] args)
    {
        int size;
        Scanner obj=new Scanner(System.in);
        System.out.println("size:");
        size=obj.nextInt();
        int a[]=new int[size];
        System.out.println("enter the array elements:");
        for(int i=0;i<size;i++)
        {
           a[i]=obj.nextInt();
        }
        int freq[]=frequency(a);
        System.out.println("enter the no. of query:");
        int q=obj.nextInt();
        while(q>0)
        {
            System.out.println("enter the element to be searched:");
            int x=obj.nextInt();
            if(freq[x]>0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            q--;
        }
    }
}
