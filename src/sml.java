import java.util.Arrays;
import java.util.Scanner;

public class sml
{
    static int[] cnt(int a[],int k)
    {
        Arrays.sort(a);
        int ans[]={a[0+k-1],a[a.length-k]};
        return ans;
    }

    public static void main(String[] args)
    {
        int i,size,k;
        Scanner obj=new Scanner(System.in);
        System.out.println("SIZE:");
        size=obj.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the array elements:");
        for(i=0;i<size;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println("enter the value of k:");
        k=obj.nextInt();
        int result[]=cnt(arr,k);
        System.out.println(k+" th smallest element:"+result[0]);
        System.out.println(k+" th largest element:"+result[1]);
    }
}
