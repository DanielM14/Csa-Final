import java.util.Scanner;
public class PathTwo
{
    public static void PathTwo() throws InterruptedException
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Why not? Do you Not like me?");
        String answer = input.nextLine();
        if(answer.equalsIgnoreCase("Yes"))
        {
         System.out.println("\nAh mt feelings, they hurt");
         PathOne.PathOne();
        }
        else
        {
            System.out.println("Do you not want to play a game?");
            String answer2 = input.nextLine();
            if(answer2.equalsIgnoreCase("yes"))
            {
             System.out.println("Then what do you want to do, just not" +
             "\ndo anything?"); 
             String does = input.nextLine();
             if(does.equalsIgnoreCase("Yes"))
             {
             Path2Part2.Path2Part2();
            }
            else
            {
             System.out.println("So you just want to talk? Alright"); 
             PathFour.PathFour();
            }
            }
            else
            {
             System.out.println("So you just want to talk? Alright"); 
             PathFour.PathFour();
            }
        }
    }
}
