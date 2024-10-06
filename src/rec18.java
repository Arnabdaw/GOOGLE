import java.util.ArrayList;
import java.util.Scanner;

public class rec18
{
    static ArrayList<Integer> fun(int a[], int x, int idx)
    {
        ArrayList<Integer> t=new ArrayList<Integer>();
        if(idx==a.length)
        {
            return t;
        }
        if(a[idx]==x)
        {
            t.add(idx);
        }
        ArrayList<Integer> smallans= fun(a,x,idx+1);
        t.addAll(smallans);
        return t;
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
        ArrayList<Integer> l=new ArrayList<>();
        l=fun(arr,x,0);
        for(int i:l)
            System.out.print(i+"  ");
    }
}
