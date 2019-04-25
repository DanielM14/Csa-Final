import java.util.Scanner;
public class PathFour
{
    public static void PathFour() throws InterruptedException
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How was your day? Good or bad");
        String robo = input.nextLine();
        if(robo.equalsIgnoreCase("Good"))
        {
            System.out.println("So was mine, i had a great breakfast with" +
            "\na few friends, oh hang on lemme show you a really cool place");
            HappyEnding.HappyEnding();
        }
        else
        {
            System.out.println("Why is that, did something bad happen," +
            "\nhere ill show you a really cool place");
            HappyEnding.HappyEnding();
        }
    }
}
