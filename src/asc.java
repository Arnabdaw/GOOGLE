import java.util.Scanner;
public class asc
{
    int[] ctb(int a[])
    {
        int i,j,temp;
        for(i=0;i<a.length-1;i++)
        {
            for(j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int size;
        System.out.println("enter the size of the array:");
        size=obj.nextInt();
        int arr[]=new int[size];
        int arr2[]=new int[size];
        System.out.println("enter the array elements:");
        for(int i=0;i<size;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println("In Ascending Order:");
        asc ob=new asc();
        arr2=ob.ctb(arr);
        for(int i=0;i<size;i++)
        {
            System.out.print(arr2[i]+"  ");
        }
    }
}
