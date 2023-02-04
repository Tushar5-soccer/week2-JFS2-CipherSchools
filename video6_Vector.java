import java.util.Iterator;
import java.util.Vector;
public class video6_Vector {
    public static void main(String[] args){
        Vector v = new Vector();
        v.add("Guns");
        v.add("Be");
        v.add("With");
        v.add("Us.");

        Iterator p= v.iterator();
        while (p.hasNext()){
            System.out.println(p.next());
        }

    }

}
