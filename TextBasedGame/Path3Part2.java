import java.util.Scanner;
public class Path3Part2
{
    public static void Path3Part2() throws InterruptedException
    {
        Scanner input = new Scanner(System.in);
        String[] items;
        items = new String[]{"Sword", "Potion", "Sheild"};
        System.out.println("Oh no a monster! you have three items" +
        "\nwith you - Sword, Potion, Sheild, what do you use");
        String itemChoice = input.nextLine();
        if(itemChoice.equalsIgnoreCase("Sword") || itemChoice.equalsIgnoreCase("Potion") || itemChoice.equalsIgnoreCase("Sheild"))
        {
            for(int i = 5; i > 0; i--)
            {
                int attack = (int)(Math.random() * 5) + 1;
                if(i == 0)
                {
                    System.out.println("You killed the beast! But now" +
                    "\nyou have to kill the dragon at the top of the mountain");
                    Path3End.Path3End();
                }
                else if(itemChoice.equalsIgnoreCase("Sheild"))
                {
                    System.out.println("You use the sheild to block" +
                    "\nas the monster attacks, you block just in time" +
                    "\n Sword - Potion - Sheild");
                    i++;
                }
                else if(attack == 1)
                {
                    System.out.println("You attack with the" + itemChoice + 
                    "\nYou hit it dead in its chest, it screams loudly " +
                    "\nand it looks incredibly mad, it has " + i + " Health" +
                    "\nSword - Potion - Sheild");   
                }
                else if(attack == 2)
                {
                    System.out.println("You attack with the" + itemChoice + 
                    "\nIt grabs its wepon ready to attack but you" +
                    "\nmove just in time and counter attack perfectally" +
                    "\nit has" + i + " Health " +
                    "\nSword - Potion - Sheild");
                }
                else if(attack == 3)
                {
                    System.out.println("You attack with the" + itemChoice + 
                    "\nAs you attack you hit the legs and they just" +
                    "\nfall off, there they are just sitting there" +
                    "\nsomehow the monster grew a new pair" +
                    "\nIt has " + i + " Health" +
                    "\nSword - Potion - Sheild");
                }
                else if(attack == 4)
                {
                    System.out.println("You attack with the" + itemChoice + 
                    "\n the monster almost dodges but you still hit it" +
                    "\nas it lunges back you prepare for another attck" +
                    "\nit has " + i + " Health" +
                    "\nSword - Potion - Sheild");
                }
                else if(attack == 5)
                {
                    System.out.println("You attack with the" + itemChoice +
                    "\nThe monster tries to couter attack but fails" +
                    "\nIt get hit and is hurt badly" +
                    "\nIt has " + i + " Health" +
                    "\nSword - Potion - Sheild");
                }
                else
                {
                 i++;   
                }
                itemChoice = input.nextLine();
            }
        }
    }
}
