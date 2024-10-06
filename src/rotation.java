import java.util.Scanner;

public class rotation
{
    static int[] rot(int a[],int k)
    {
        int j=0,i;
        int n=a.length;
        k=k%n;
        int ans[]=new int[n];
        for(i=n-k;i<n;i++)
        {
            ans[j++]=a[i];
        }
        for(i=0;i<n-k;i++)
        {
            ans[j++]=a[i];
        }
        return ans;
    }
    static void pnt(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int i, size;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        size = obj.nextInt();
        int[] a = new int[size];
        System.out.println("enter the array elements:");
        for (i = 0; i < a.length; i++)
        {
            a[i] = obj.nextInt();
        }
        System.out.println("enter the value of k:");
        int k= obj.nextInt();
        int b[]=rot(a,k);
        System.out.println("AFTER ROTATION BY "+k+" STEPS: ");
        pnt(b);
    }
}
