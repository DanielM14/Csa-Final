import java.util.Scanner;
public class Path3End
{
    public static void Path3End()throws InterruptedException
    {
        Scanner input = new Scanner(System.in);
        System.out.println("The dragon looms over you ready" +
        "\nto attack, it starts flying at you, think fast! it's" +
        "\nabout to breathe fire at you! \n Sword - Potion - Shield");
        String Block = input.nextLine();
        int score2 = Path3Part2.score;
        if(Block.equalsIgnoreCase("Shield"))
        {
            System.out.println("You block the Dragon fire with" +
            "\nthe sheild, you feel hot but your not hurt");
            for(int i = 10; i > 0; i--)
            {
                int attack = (int)(Math.random() * 5) + 1;
                if(Block.equalsIgnoreCase("Shield"))
                {
                    System.out.println("You use the shield to block" +
                    "\nas the Dragon fire again, you block just in time" +
                    "\n Sword - Potion - Shield");
                    i++;
                }
                else if(attack == 1 && Block.equalsIgnoreCase("Sword") || Block.equalsIgnoreCase("Potion") || Block.equalsIgnoreCase("Shield"))
                {
                    System.out.println("You attack with the" + Block + 
                    "\nYou hit it right on its snout, it rours loudly " +
                    "\nand it looks ready to attack, it has " + i + " Health" +
                    "\nSword - Potion - Shield");   
                }
                else if(attack == 2 && Block.equalsIgnoreCase("Sword") || Block.equalsIgnoreCase("Potion") || Block.equalsIgnoreCase("Shield"))
                {
                    System.out.println("You attack with the" + Block + 
                    "\nIt fly's at you but you move and hit it's tail" +
                    "\nit has" + i + " Health " +
                    "\nSword - Potion - Shield");
                }
                else if(attack == 3 && Block.equalsIgnoreCase("Sword") || Block.equalsIgnoreCase("Potion") || Block.equalsIgnoreCase("Shield"))
                {
                    System.out.println("You attack with the" + Block + 
                    "\nAs you attack you hit the jaw" +
                    "\nit's teeth clash together and a few fly out" +
                    "\nsomehow the Dragon grew more teeth" +
                    "\nIt has " + i + " Health" +
                    "\nSword - Potion - Shield");
                }
                else if(attack == 4 && Block.equalsIgnoreCase("Sword") || Block.equalsIgnoreCase("Potion") || Block.equalsIgnoreCase("Shield"))
                {
                    System.out.println("You attack with the" + Block + 
                    "\nthe Dragon tries to fly out of the way but" +
                    "\nyou still manage to land a hit" +
                    "\nit has " + i + " Health" +
                    "\nSword - Potion - Shield");
                }
                else if(attack == 5 && Block.equalsIgnoreCase("Sword") || Block.equalsIgnoreCase("Potion") || Block.equalsIgnoreCase("Shield"))
                {
                    System.out.println("You attack with the" + Block +
                    "\nThe Dragon breathes fire but you move out of" +
                    "\nthw way, it's hit" +
                    "\nIt has " + i + " Health" +
                    "\nSword - Potion - Shield");
                }
                else
                {
                    System.out.println("What? Try again.");
                 i++;   
                }
                score2 = score2 + 1;
                Block = input.nextLine();
            }
            System.out.println("You killed the Dragon" +
                  "\nand have saved the day!" +
                  "\nLet's find out what's on top of the mountain..." +
                  "\nA robot? Well at least you can salvage it for parts" +
                  "\nThis was great" + score2 + " points, Game Ending, Pixely!");
        }
        else
        {
            System.out.println("You have been burned up by the dragon" +
            "\n Dead ending, How Rotten!");
        }
    }
}
