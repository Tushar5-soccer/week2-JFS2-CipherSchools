import java.util.InputMismatchException;
import java.util.Scanner;

public class video3_4_Exception1_2 {
    static Scanner sc =new Scanner(System.in);
    static int a,b,res;
    public static void main(String[] args){
        try {
            System.out.println("Enter First Number ");
            a=sc.nextInt();
            System.out.println("Enter Second Number");
            b =sc.nextInt();
            res = a/b;
        }
        catch(InputMismatchException ime){
            System.out.println("IME Detected");
        }
        catch (ArithmeticException ae) {
            System.out.println("AE Detected");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("The Division is " + res);
        }
    }
}
