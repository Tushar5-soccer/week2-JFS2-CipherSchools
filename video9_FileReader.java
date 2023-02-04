import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class video9_FileReader {
    public static void main(String[] args)throws IOException {
        FileReader fr= new FileReader("C:\\Users\\TUSHAR\\OneDrive\\Desktop\\LPU\\SEM 6\\JAVA Training\\Shivangi Mam Java\\Video8_File Handling.txt");
        BufferedReader br= new BufferedReader(fr);
        String s = br.readLine();
        while((s=br.readLine())!= null) {
            System.out.println(s);
        }
        br.close();
        fr.close();
    }
}
