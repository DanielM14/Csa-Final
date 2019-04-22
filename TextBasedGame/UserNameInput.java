import java.util.Scanner;
public class UserNameInput
{
    public static int i = 5;
    static Scanner input = new Scanner(System.in);
    public static String userName;
    public static void main(String[] args)
    {
        System.out.println("What's your name?");
        userName = input.nextLine(); /// All this allows the user to input their name
        System.out.print("Hello " + userName + " nice to meet you");
    }
}
/// Hey you cuck of a me remeber this int i = MyClass.someInt; to
/// make a variable accesable by all classes