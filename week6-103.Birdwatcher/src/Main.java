
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        ArrayList<Bird> db = new ArrayList<Bird>();

        while (true) {
            System.out.print("? ");
            String command = reader.nextLine();

            if (command.equalsIgnoreCase("Add")) {
                System.out.print("Name: ");
                String name = reader.nextLine();
                System.out.print("Latin Name: ");
                String Latin = reader.nextLine();
                Bird buffer = new Bird(name, Latin);
                db.add(buffer);

            } else if (command.equalsIgnoreCase("Observation")) {
                System.out.print("What was observed:? ");
                String name = reader.nextLine();
                boolean check = false;
                for (Bird i : db) {
                    if (i.getName().equalsIgnoreCase(name)) {
                        i.Observed();
                        check = true;
                    }
                }
                if (check == false) {
                    System.out.println("Is not a bird!");
                }

            } else if (command.equalsIgnoreCase("Statistics")) {
                for (Bird i : db) {
                    System.out.println(i);;
                }

            } else if (command.equalsIgnoreCase("Show")) {
                System.out.print("What? ");
                String name = reader.nextLine();
                for (Bird i : db) {
                    if (i.getName().equalsIgnoreCase(name)) {
                        System.out.println(i);
                    }
                }

            } else if (command.equalsIgnoreCase("Quit")) {
                break;
            }
        }
    }
}