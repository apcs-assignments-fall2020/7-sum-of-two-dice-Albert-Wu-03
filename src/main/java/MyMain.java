import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        int n = ThreadLocalRandom.current().nextInt(1, 7);
        return n;
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static int[] sumOfTwoDice(int n) {
        int[] dice = new int[11];
        for(int b = n; b > 0; b--) {
		int d = ThreadLocalRandom.current().nextInt(1, 7);
        int d1 = ThreadLocalRandom.current().nextInt(1, 7);
        int i = d+d1-2;
        dice[i]+=1; 
	}
    return dice;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pair of dice would you like to roll?");
        int n = scan.nextInt();
        System.out.println(sumOfTwoDice(n));
    }
}
