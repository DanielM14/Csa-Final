import java.util.Scanner;
public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
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
