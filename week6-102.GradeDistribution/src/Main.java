
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void printstar(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<Integer>();
        int[] count = {0, 0, 0, 0, 0, 0};

        System.out.println("Type exam scores, -1 completes: ");
        int buffer = 0;
        while (buffer != -1) {
            buffer = lukija.nextInt();
            if (buffer >= 0 && buffer < 61) {
                grades.add(buffer);
            }
        }
        for (int i : grades) {
            if (i >= 0 && i < 30) {
                count[0]++;
            } else if (i > 29 && i < 35) {
                count[1]++;
            } else if (i > 34 && i < 40) {
                count[2]++;
            } else if (i > 39 && i < 45) {
                count[3]++;
            } else if (i > 44 && i < 50) {
                count[4]++;
            } else {
                count[5]++;
            }
        }

        double accepted = 0;
        double allScores = 0;

        System.out.println("Grade distribution: ");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            printstar(count[i]);
            allScores += count[i];
            if (i != 0) {
                accepted += count[i];;
            }
        }
        System.out.println("Acceptance percentage: " + (double) (accepted / allScores * 100));
    }
}
