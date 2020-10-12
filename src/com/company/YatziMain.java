package com.company;
import java.util.Scanner;
//Islam Mohamed
public class YatziMain {
    private static final Scanner sc = new Scanner(System.in);
    private static final Dice[] dices = new Dice[5];
    private static int sides = 0;
    public static void main(String[] args) {
        IdentifyDices();
        StartYatzi();
    }

    public static void IdentifyDices() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = new Dice();
        }
    }

    public static void StartYatzi() {
        System.out.println("Hello and Welcome to Yatzi");
        System.out.println("**************************");
        System.out.println("Type (S) to start the fun");
        while (sides < 3) {
            if (sc.next().equalsIgnoreCase("S")) {
                sides = sides + 1;
                RollDice();
            } else {
                System.out.println("Ending Yatzi...");
                return;
            }
        }
            if (sides == 3) {
            System.out.println("**************************");
            System.out.println("Game Over \n" + "New Game press (N)");
            if (sc.next().equalsIgnoreCase("N")) {
                sides = 0;
                StartYatzi();
            } else {
                System.out.println("Ending Yatzi...");
            }
            }
    }

    public static void RollDice() {
        for (int i = 0; i < dices.length; i++) {
            dices[i].generateRandomValue();
            System.out.println("Dice " + (i + 1) + " shows " + dices[i].value);
        }
        if (YatziOrNot(dices)) {
            System.out.println("Yatzi " + sides + " out of 3 tries");

        } else {
            System.out.println("Try Again!" + sides + " out of 3 tries" + " Press(S)");
        }
    }

    public static boolean YatziOrNot(Dice[] d) {
        boolean y = true;
        for (int i = 1; i < 5; i++) {
            if (d[i].value != d[i - 1].value) {
                y = false;
            }
        }
        return y;
    }
}
