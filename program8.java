import java.util.Random;
import java.util.Scanner;

public class program8 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        String [] choice = {"rock", "paper" , "scissors"};
        
        System.out.println("welcome to game");
        System.out.println("enter 0 for the rock , 1 for the paper , 2 for scissors");

        int playerchoice = scanner.nextInt();

                if (playerchoice < 0 || playerchoice > 2) {
                System.out.println("invalid choice");
                            scanner.close();

                return;
                         }

                int computerchoice = random.nextInt(3);

                System.out.println("you chose:" + choice[playerchoice]);
                System.out.println("computer choice:" + choice[computerchoice]);

                if (playerchoice == computerchoice) {
                    System.out.println("its a tie");
                }

                else if ((playerchoice == 0 && computerchoice == 2) ||
                        ( playerchoice == 1 && computerchoice == 0 ) ||
                         (playerchoice == 2 && computerchoice == 1)) {
                            System.out.println("you win");
                         }
                else {
                    System.out.println("computer wins");
                }
                scanner.close();

        }
}
