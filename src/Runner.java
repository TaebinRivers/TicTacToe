/**
 * Created by h205p4 on 2/27/20.
 */

import java.util.Scanner;


public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String playerName = scanner.nextLine();
        Human p = new Human(playerName,"X");
        Computer c = new Computer("O");
        Board b = new Board();

    }

}
