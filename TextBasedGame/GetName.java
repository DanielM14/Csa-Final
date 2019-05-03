import java.util.Scanner;
public class GetName ///this is what sets the players name
{
    static Scanner input = new Scanner(System.in);
    public static String name;
    public String getName()
    {
        return this.name;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }
    public static void names() throws InterruptedException
    {
        System.out.println("What's your name?");
        name = input.nextLine(); /// All this allows the user to input their name
        System.out.print("Hello " + name + " nice to meet you" + 
        "\nplease use yes and no for answers please :)");
    }
}
/// Hey you me remeber this int i = MyClass.someInt; to
/// make a variable accesable by other classes