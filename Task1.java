package CodSoft;
//Task - 1 of CodSoft

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int round;
        char option;
        int score = 0;
        boolean result = false;
        int i = 3;
        do {
            System.out.println();
            System.out.println("Do you want to play.Enter 'Y/y' for Yes and 'N/n' for No : ");

            option = sc.next().charAt(0);
            if (option == 'Y' || option == 'y') {
                do {
                    System.out.println("enter a number between 1 and 100 : ");
                    int num = sc.nextInt();
                    int randomNumber = random.nextInt(1, 100);
                    if (num == randomNumber) {
                        score = 100;
                        System.out.println("You Won");
                        result = true;
                    } else {

                        if (randomNumber + 20 < num || randomNumber+20<-50) {

                            score = num - randomNumber;
                            System.out.println("The number is too high");
                        } else if (randomNumber - 20 > num || randomNumber-20>150) {

                            score = randomNumber - num;
                            System.out.println("The number is too low");
                        }
                        System.out.println("|---------------------------------------------------|");
                        System.out.println("| Wrong Choice                                      |");
                        System.out.println("| Your have "+(i-1)+" remaining chances !                   |");
                        System.out.println("|---------------------------------------------------|");
                    }

                    i--;
                    if (result == true) break;
                } while (i > 0 && result == false);
            }
            System.out.println("Your score is "+score+" out of 100");
        }while(option!='N' && option !='n');

    }
}

