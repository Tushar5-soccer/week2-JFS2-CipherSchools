import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class video5_ArrayList {
    public static void main(String[] args){
        ArrayList a1= new ArrayList();
        List a2= new ArrayList();
        a1.add("Apple");
        a1.add('A');
        a1.add(200);
        a2.add(45);
        a2.add("jk");
        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(10000);
        a3.add(852);
        a3.add(654);
        System.out.println("Size of A1 "+a1.size());
        for(int i=0; i<a1.size();i++) {
            System.out.println("A1 " + a1.get(i));
        }
        System.out.println("Size of A2 "+a2.size());
        for(int i=0; i<a2.size();i++) {
            System.out.println("A2 " + a2.get(i));
        }
        System.out.println("Size of A3 "+a3.size());
        for(int i=0; i<a3.size();i++) {
            System.out.println("A3 " + a3.get(i));
        }

        a1.remove(0);
        a2.remove(1);
        a3.remove(2);

        System.out.println("After removal of elements ");

        for(int i=0; i<a1.size();i++) {
            System.out.println("A1 " + a1.get(i));
        }
        for(int i=0; i<a2.size();i++) {
            System.out.println("A2 " + a2.get(i));
        }
        for(int i=0; i<a3.size();i++) {
            System.out.println("A3 " + a3.get(i));
        }

        a1.set(0, "GUN");
        a2.set(0,5000);
        a3.set(1,108);
        System.out.println("After update ");

        for(int i=0; i<a1.size();i++) {
            System.out.println("A1 " + a1.get(i));
        }
        for(int i=0; i<a2.size();i++) {
            System.out.println("A2 " + a2.get(i));
        }
        for(int i=0; i<a3.size();i++) {
            System.out.println("A3 " + a3.get(i));
        }
        a3.sort(Comparator.naturalOrder());

        System.out.println("After sorting");

        for(int i=0; i<a3.size();i++) {
            System.out.println("A3 " + a3.get(i));
        }

    }
}
