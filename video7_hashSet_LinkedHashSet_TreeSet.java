import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class video7_hashSet_LinkedHashSet_TreeSet {
    public static void main(String[] args){
        HashSet hs= new HashSet();
        hs.add("AA");
        hs.add("AB");
        hs.add("AC");
        hs.add("AD");
        System.out.println(hs);
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("ABA");
        lhs.add("ABB");
        lhs.add("ABC");
        lhs.add("ABD");
        System.out.println(lhs);

        TreeSet ts = new TreeSet();
        ts.add("AAA");
        ts.add("AAB");
        ts.add("AAC");
        ts.add("AAD");
        System.out.println(ts);
    }
}
