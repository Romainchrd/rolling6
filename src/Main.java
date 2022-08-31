import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String input1 = "";
            int randInt1 = 0;
            int y = 0;
            while(randInt1 != 6)
            {
                System.out.println("user1: click y to roll the dice ");
                input1 = input.nextLine();
                if(input1.equals("y"))
                {
                    randInt1 = (int)(Math.random() * (6 + 1));
                    System.out.println(randInt1);
                    y ++;
                }
                else
                {
                    System.out.println("click y to roll the dice ");
                    input1 = input.nextLine();
                }
            }
            System.out.println("user1 got a 6 in " + y + " tries");
        String input2 = "";
        int randInt2 = 0;
        int x = 0;
        while(randInt2 != 6)
        {
            System.out.println("user2: click y to roll the dice ");
            input2 = input.nextLine();
            if(input2.equals("y"))
            {
                randInt2 = (int)(Math.random() * (6 + 1));
                System.out.println(randInt2);
                x ++;
            }
            else
            {
                System.out.println("click y to roll the dice ");
                input2 = input.nextLine();
            }
        }
        System.out.println("user2 got a 6 in " + x + " tries");
        if(x > y)
        {
            System.out.println("user1 rolled a 6 in less tries than user2");
        }
        else if(y > x)
        {
            System.out.println("user2 rolled a 6 in less tries than user1");
        }
        else
        {
            System.out.println("user2 rolled a 6 in the same amount of tries than user1");
        }
    }
}