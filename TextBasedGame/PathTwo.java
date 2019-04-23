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
        }
        else if(answer.equalsIgnoreCase("No"))
        {
            System.out.println("Do you not want to play a game?");
            String answer2 = input.nextLine();
            if(answer2.equalsIgnoreCase("yes"))
            {
             System.out.println("Then what do you want to do, just not" +
             "\ndo anything?"); 
             //path 2 p 2
            }
            else
            {
             System.out.println("So you just want to talk? Alright"); 
             //path four
            }
        }
    }
}
