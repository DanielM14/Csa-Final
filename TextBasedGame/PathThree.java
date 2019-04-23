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
         "\nof a mountain and it has a cure for a disese i just" +
         "\ninfected you with, you better go get it or we'll both be dead!");   
        }
        else
        {
         PathTwo.PathTwo();
        }
    }
}
