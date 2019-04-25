import java.util.Scanner;
public class Path3End
{
    public static void Path3End()throws InterruptedException
    {
        Scanner input = new Scanner(System.in);
        System.out.println("The dragon looms over you ready" +
        "\nto attack, it starts flying at you, think fast! it's" +
        "\nabout to breathe fire at you! \n Sword - Potion - Sheild");
        String Block = input.nextLine();
        if(Block.equalsIgnoreCase("Sheild"))
        {
            
            System.out.println("You just barely block the dragons" +
            "\nfire in time, just enough to pull out your sword and" +
            "\nslay it, you reach the top to find..." +
            "\nA robot? Well at least you can salvage it for parts" +
            "\nThis was great, Game Ending, Pixely!");
        }
    }
}
