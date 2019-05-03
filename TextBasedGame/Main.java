import java.util.Scanner;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        String s = "hello";
        byte[] data = s.getBytes();
        OutputStream output = null;
        InputStream write = null;
        Path file =
        Paths.get("C:\\Users\\gj159343\\Desktop\\Gamestuff.txt");
        try
        {
        output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
        }
        catch(Exception e)
        {
            System.out.println(s);
        }
        try
        {
            write = Files.newInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(write));
        }
        catch(IOException e)
        {
            System.out.println(s);
        }
        GetName.names();
        String userName2 = GetName.name; 
        System.out.println("\nSo do you want to start?");
        Scanner input = new Scanner(System.in);
        String yesNo = input.nextLine();
        if(yesNo.equalsIgnoreCase ("yes"))
        {
            PathThree.PathThree();
        }
        else
        {
            PathTwo.PathTwo();
        }
    }
}
