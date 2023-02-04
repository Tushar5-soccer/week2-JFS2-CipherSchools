import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class video7_HashMap {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args){
        HashMap<String , Integer> hm = new HashMap<String, Integer>();
        System.out.println("Enter 5 English Words");
        for(int i=1;i<=5;i++){
            String s=sc.nextLine();
            hm.put(s,s.length());
        }
        System.out.println(hm);
        HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
        System.out.println("Enter 5 Subject Marks");
        for(int i=1;i<=5;i++){
            int s=sc.nextInt();
            if(s>45)
                hm1.put(s,"PASS");
            else
                hm1.put(s, "Fail");
        }
        System.out.println(hm1);

    }

}
