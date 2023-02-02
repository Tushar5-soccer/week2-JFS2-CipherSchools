public class video2_this {
    int ar=5;
    void test (int ar){
        System.out.println(ar);
        ar=10;
        this.ar=ar;

    }
    public static void main(String[] args){
        int ar=12;
        video2_this ob= new video2_this();
        ob.test(ar);
        System.out.println(ob.ar);
    }
}

