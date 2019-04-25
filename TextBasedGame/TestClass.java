import java.util.Scanner;
public class TestClass
{
    public static void main(String[] args) throws InterruptedException
    {
        UserNameInput.names();
        String userName2 = UserNameInput.userName; 
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
