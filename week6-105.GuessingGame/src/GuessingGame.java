
import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);
        int i = average(lowerLimit, upperLimit);
        while ((i != upperLimit)) {

            if (this.isGreaterThan(i)) {
                lowerLimit = i + 1;
            } else {
                upperLimit = i;
            }
            i = average(lowerLimit, upperLimit);

         /*   System.out.println("Average " + i);
            System.out.println("Upper Limit" + upperLimit);
            System.out.println("lowerlimit " + lowerLimit);*/
        }
        System.out.println("The number you're thinking of is " + i + ".");
    }

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    public static int howManyTimesHalvable(int number) {
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }

    public boolean isGreaterThan(int value) {
        System.out.println("Is your number greater than " + value + "? (y/n)");
        if (this.reader.nextLine().equals("y")) {
            return true;
        }
        return false;
    }

    public int average(int firstNumber, int secondNumber) {
        return ((firstNumber + secondNumber) / 2);
    }
}
