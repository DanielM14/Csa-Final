import java.util.Scanner;
public class UserNameInput
{
    static Scanner input = new Scanner(System.in);
    static String userName;
    public static void main(String[] args)
    {
        System.out.println("What's your name?");
        userName = input.nextLine();
        System.out.print("Hello " + userName + " nice to meet you");
    }
}
