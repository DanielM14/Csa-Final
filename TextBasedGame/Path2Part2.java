import java.util.Scanner;
public class Path2Part2
{
    public static void Path2Part2() throws InterruptedException
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Then why did you even come here? To just " +
        "\ndo nothing?");
        String nothing = input.nextLine();
        if(nothing.equalsIgnoreCase("Yes"))
        {
            System.out.println("Well thats a bit odd but ok, just make " +
            "sure not to do ANYTHING then");
            NoGameEnd.NoGameEnd();
        }
        else
        {
            PathFour.PathFour();
        }
    }
}
