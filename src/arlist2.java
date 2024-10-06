import java.util.ArrayList;
import java.util.Collections;

public class arlist2
{
    public static void main(String[] args)
    {
        ArrayList<String> s=new ArrayList<>();
        s.add("Welcome");
        s.add("To");
        s.add("Physics");
        s.add("Wallah");
        System.out.println("OG:"+s);
        Collections.sort(s);
        System.out.println("sorted list:"+s);
        Collections.sort(s, Collections.reverseOrder());
        System.out.println("reversed List:"+s);
    }
}
