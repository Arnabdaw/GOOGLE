import java.util.Arrays;
import java.util.Scanner;
public class arrbasic
{
    int total(int a[])
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        return sum;
    }
    float average(int a[])
    {
        int s = 0;
        float avg;
        for (int i = 0; i < a.length; i++)
        {
            s = s + a[i];
        }
        //avg = (float) (s / a.length);
        avg = (float) s / a.length;
        return avg;
    }

    public static void main(String[] args)
    {
       int i,size;
       Scanner obj=new Scanner(System.in);
       System.out.println("enter the size of the array:");
       size=obj.nextInt();
       int arr[]=new int[size];
       System.out.println("enter the array elements:");
       for(i=0;i<size;i++)
       {
           arr[i]=obj.nextInt();
       }
       arrbasic ob=new arrbasic();
       int sum=ob.total(arr);
       float avg=ob.average(arr);
       System.out.println("SUM="+sum);
       System.out.println("AVG="+avg);
    }
}
