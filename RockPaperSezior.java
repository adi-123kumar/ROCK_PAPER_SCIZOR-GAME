//1>>>>>>>>>>>>rock
//2>>>>>>>>>>>>paper
//3>>>>>>>>>>>>>scizor
import java.awt.*;
import java.util.Random;
import java.util.Scanner;
public class RockPaperSezior {
    public static void main(String[] args){
        Random random=new Random();
        Scanner input= new Scanner(System.in);
        int i;
        int computer_win = 0, you_win = 0;
        System.out.println("\n");
        System.out.println(" *********** WELCOME TO GAME *********");
        int start_choice;
        int choice1;

        do{


            System.out.println("ENTER YOUR CHOICE");
            System.out.println("1.START GAME");
            System.out.println("2.EXIT GAME");
            System.out.println("3.RULES");
            choice1=input.nextInt();
            switch(choice1){
                case 1:
                    int round;
                    System.out.println("ENTER HOW MUCH ROUND YOU WANT");
                    round=input.nextInt();
                    for(i=0;i<round;i++) {
                        System.out.println("Enter your choice....");
                        System.out.print("1.ROCK\n2.PAPER\n3.SCIZOR\n");
                        int choice = input.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("YOU CHOSED ROCK....");
                                int computer_choice = random.nextInt(1, 4);
                                if (choice == computer_choice) {
                                    System.out.println("COMPUTER CHOSES ROCK ,MATCH DRAW....");
                                } else if (computer_choice == 2) {
                                    System.out.println("COMPUTER CHOSES PAPER ");
                                    System.out.println("YOU LOST.....");
                                    computer_win += 1;
                                } else if (computer_choice == 3) {
                                    System.out.println("COMPUTER CHOSES SCIZOR");
                                    System.out.println("YOU WON..........");
                                    you_win += 1;
                                }
                                break;
                            case 2:
                                System.out.println("you chose PAPER....");
                                int computer_choice2 = random.nextInt(1, 4);
                                if (choice == computer_choice2) {
                                    System.out.println("COMPUTER CHOSES PAPER , MATCH DRAW....");
                                } else if (computer_choice2 == 1) {
                                    System.out.println("COMPUTER CHOSES ROCK ");
                                    System.out.println("YOU WON.....");
                                    you_win += 1;
                                } else if (computer_choice2 == 3) {
                                    System.out.println("COMPUTER CHOSES SEZIOR");
                                    System.out.println("YOU LOST..........");
                                    computer_win += 1;
                                }
                                break;
                            case 3:
                                System.out.println("YOU CHOSED SCIZOR....");
                                int computer_choice3 = random.nextInt(1, 4);
                                if (choice == computer_choice3) {
                                    System.out.println(" COMPUTER CHOSES SCIZOR , MATCH DRAW....");
                                } else if (computer_choice3 == 1) {
                                    System.out.println("COMPUTER CHOSES ROCK ");
                                    System.out.println("YOU LOST.....");
                                    computer_win += 1;
                                } else if (computer_choice3 == 2) {
                                    System.out.println("COMPUTER CHOSES PAPER");
                                    System.out.println("YOU WON..........");
                                    you_win += 1;
                                }
                                break;
                            default:
                                System.out.println("Enter a valid number .....");

                        }
                        System.out.printf("COMPUTER = %d \t YOU = %d \n", computer_win, you_win);

                    }
                    if(computer_win>you_win){
                        System.out.println("Computer win the tournament.....better luck next time");
                    }
                    else if(computer_win==you_win){
                        System.out.println("SORRY BUT NOONE HAD WON Match draw ......");
                    }
                    else{
                        System.out.println("*********.......HURREY CHAKDE PHATE .....*********");
                        System.out.println("********YOU WIN THE TOURNAMENT CONGRATULATION********");
                    }

            }
            System.out.println("PRESS 0 FOR EXIT");
            start_choice=input.nextInt();
        }while(start_choice!=0);

    }
}
