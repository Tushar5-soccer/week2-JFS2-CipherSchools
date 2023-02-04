import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class video8_FileHandling {
    public static void main(String[] args)throws IOException{
        File f=new File("C:\\Users\\TUSHAR\\OneDrive\\Desktop\\LPU\\SEM 6\\JAVA Training\\Shivangi Mam Java\\Video8_File Handling.txt");
        try {
            f.createNewFile();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("File Created Successfully.");
        if(f.exists()){
            System.out.println("Printing File Details");
            System.out.println("----------------------");
            System.out.println("File Name "+f.getName());
            System.out.println("File Size "+f.length());
            System.out.println("File Path "+f.getAbsolutePath());
            System.out.println("Is File Readable? "+f.canRead());
            System.out.println("Is File Writable? "+f.canWrite());
        }
        System.out.println("Writing in file");
        FileWriter Fw = new FileWriter("C:\\Users\\TUSHAR\\OneDrive\\Desktop\\LPU\\SEM 6\\JAVA Training\\Shivangi Mam Java\\Video8_File Handling.txt");
        Fw.write("I am Tushar.");
        Fw.write("WHat is your name?");
        Fw.write("Jai MahaDev");
        Fw.flush();
        Fw.close();
        System.out.println("File Updated Successully.");
    }
}
