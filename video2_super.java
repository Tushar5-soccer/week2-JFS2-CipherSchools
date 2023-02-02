class app{
    app(){
        System.out.println("APP");
    }
    app(int a){
        app ob = new app();
        System.out.println(a);
    }
}
public class video2_super extends app {
    video2_super(){
        super(20);
        System.out.print("video2_find");
    }
    public static void main(String[]args){
        new video2_super();
    }
}
/*use of super
to call paramaterized constructor
 */
