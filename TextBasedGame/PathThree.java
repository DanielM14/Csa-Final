import java.util.Scanner;
public class PathThree
{
    public static void PathThree() throws InterruptedException
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How do you want to start, \nhow about an adventure?");
        String howStart = input.nextLine();
        if(howStart.equalsIgnoreCase("yes"))
        {
         System.out.println("Perfect, so there's this robot on top" +
         "\nof a mountain and it has a cure for a disese" +
         "\n i just infected you with, you better go " +
         "\nget it or we'll both be dead! Will you do it?"); 
         String challenge = input.nextLine();
         if(challenge.equalsIgnoreCase("Yes"))
         {
             Path3Part2.Path3Part2();
         }
         else
         {
         System.out.println("Haha well that sure sucks for you cuz your " +
         "\ndoing it anyway!");
         Path3Part2.Path3Part2();
         }
        }
        else
        {
         PathTwo.PathTwo();
        }
    }
}
