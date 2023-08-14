package Number_Game;

import java.util.*;

public class game {
    static int num;
    static int geussNum;
    static int round;

    public void inputCheck() {
        Scanner sc = new Scanner(System.in);

        System.out.println("guess a number from 1 to 10 : ");
        geussNum = sc.nextInt();
        if (geussNum == 0) {

            System.out.println("please guess a number from 1 to 10");
        }

        else if (geussNum == num) {

            System.out.println("woo hoo! Its correct guess.");
        }

        else if (geussNum > num && geussNum <= 10 && geussNum > 0) {

            System.out.println("Incorrect! Its high,Try again!");

        }

        else if (geussNum < num && geussNum <= 10 && geussNum > 0) {

            System.out.println("Incorrect! Its low,Try again!");
        }

        else {

            System.out.println("please enter valid number");
        }

    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("press 1 - next round \npress 0 - exit");
        round = sc.nextInt();
    }

    void nextRound() {

        if (round == 1) {

            if (geussNum != num) {

                for (int i = 3; i >= 1; i--) {

                    inputCheck();
                    System.out.println("(" + (i - 1) + " attemps left)");
                }
            } else {

                System.out.println("woo hoo! Its correct guess.");
            }
        } else if (round == 0) {
        } else {

            System.out.println("Invalid Input");
            nextRound();
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println();
        System.out.println("---* WELCOME TO THE NUMBER GAME *---");
        game g = new game();
        Random random = new Random();
        num = random.nextInt(10) + 1; // +1 for non zero number

        if (geussNum != num) {

            for (int i = 3; i >= 1; i--) {

                g.inputCheck();
                System.out.println("(" + (i - 1) + " attemps left)");
            }
        } else {

            System.out.println("woo hoo! Its correct guess.");
        }
        for (int i = 1; i >= 0; i++) {
            g.accept();
            g.nextRound();
            if (round == 0) {
                break;
            }
        }
    }

}
