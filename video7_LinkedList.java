import java.util.Iterator;
import java.util.LinkedList;

public class video7_LinkedList {
    public static void main(String[] args){
        LinkedList ml= new LinkedList();
        ml.add("Shiv");
        ml.add("Shankar");
        ml.add("BholeNath");
        ml.add("Mahakaal");

        Iterator i= ml.iterator();
        System.out.println("My list");
        while(i.hasNext()){
            System.out.println(i.next());
        }
        ml.addFirst("MahaDev");
        ml.addLast("Shambhu");
        Iterator j= ml.iterator();
        System.out.println("My list after updation ");
        while(j.hasNext()){
            System.out.println(j.next());
        }
        System.out.println("Top "+ml.peek());
        System.out.println("Poll "+ml.poll());
    }
}
