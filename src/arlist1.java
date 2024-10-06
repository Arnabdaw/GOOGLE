import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class arlist1
{
    static void swap(ArrayList<Integer> a,int i,int j)
    {
        Integer temp=Integer.valueOf(a.get(i));
        a.set(i,a.get(j));
        a.set(j,temp);
    }
    static void rev(ArrayList<Integer> t)
    {
        int i=0;
        int j=t.size()-1;
        while(i<j)
        {
            swap(t,i,j);
            i++;
            j--;
        }
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> l=new ArrayList<>();
        l.add(0);
        l.add(10);
        l.add(3);
        l.add(5);
        l.add(22);
        l.add(10);
        System.out.println("Original List: "+l);
        Collections.reverse(l);
        //rev(l);
       // System.out.println("Reverse List: "+l);
        Collections.sort(l);
        System.out.println("Ascending Order:"+l);
        Collections.sort(l,Collections.reverseOrder());
        System.out.println("Descending Order:"+l);
    }
}
