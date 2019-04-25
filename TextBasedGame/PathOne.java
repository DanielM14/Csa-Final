import java.util.Scanner;
public class PathOne
{
    public static void PathOne() throws InterruptedException
    {
        Scanner input = new Scanner(System.in);
        System.out.println("You know that was really mean, how about" +
        "\nan apology?");
        String sorry = input.nextLine();
        if(sorry.equalsIgnoreCase("Yes"))
        {
            System.out.println("Thank you vey much, i forgive you." +
            "Do you wanna start now?");
            String start = input.nextLine();
            if(start.equalsIgnoreCase("Yes"))
            {
                PathThree.PathThree();
            }
        }
        else
        {
            System.out.println("Why you are just mean now. Leave!" +
            "And never come back here again!");
            AngryEnding.AngryEnding();
        }
    }
}
