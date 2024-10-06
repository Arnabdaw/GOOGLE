import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Scanner;

public class insert
{
    void ins(int a[],int pos,int ele)
    {
        int i;
        for(i=a.length-2;i>=pos-1;i--)
        {
            a[i+1]=a[i];
        }
        a[pos-1]=ele;
        System.out.println("UPDATED ARRAY:");
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        int pos,ele,size,i;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        size=obj.nextInt();
        int arr[]=new int[size+1];

        System.out.println("enter the array elements:");
        for(i=0;i<size;i++)
        {
            arr[i]=obj.nextInt();
        }
        insert ob=new insert();
        System.out.println("enter the position :");
        pos=obj.nextInt();
        System.out.println("enter the element :");
        ele=obj.nextInt();
        ob.ins(arr,pos,ele);

    }

}
