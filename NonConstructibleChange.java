import java.util.Arrays;
import java.util.Scanner;

/**
 * Non-Constructible Change
 * 
 * Given an array of positive integers representing the values of coins in your possession, write a function that
 * returns the minimum amount of change (the minimum sum of money) that you cannot create.  The given
 * coins can have any positive integer value and aren't necessarily unique (i.e., you can have multiple coins of
 * the same value).
 * 
 * For example, if you're given coins = [1, 2, 5], the minimum amount of change that you can't create
 * is 4.  If you're given no coins, the minimum amount of change that you can't create is 1.
 * 
 * Source: https://www.algoexpert.io/questions/Non-Constructible%20Change
 */

public class NonConstructibleChange {
    
    public static int nonConstructibleChange(int[] coins) {

        Arrays.sort(coins);

        int change = 0;

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] > change + 1) {
                return change + 1;
            }
            change += coins[i];
        }

        return change + 1;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many coins do you have?");
        int arrayLength = scanner.nextInt();
        int[] userArray = new int[arrayLength];
        System.out.println("Please input your coins one by one: ");

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Coin " + (i + 1) + " :");
            userArray[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.println("The smallest amount of change you cannot make is: " + nonConstructibleChange(userArray) + " cents\n");
    }
    
}
