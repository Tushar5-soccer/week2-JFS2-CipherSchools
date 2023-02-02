class aa{
    static final String a="Sshhh!";
    public void ax(){
        System.out.println("AA");
    }
}
class ab extends aa{
    static final int ax=20;
    public void ax(){
        System.out.println("AB");
    }
}
public class video2_final extends ab{
    public static void main(String[] args){
        System.out.println(a);
        System.out.println(ax);
    }

}
/* use final keyword
1 final variable value can not be changed.
2 final method can nt be overridden.
2 final class can not be inherited.
 */