/**
 * Created by h205p4 on 2/27/20.
 */

/*Checks to see if the comp has first move. if yes, goes in the corner. if no, then checks to see where
* The  player went, and decides to play based off of that move.  */

public class Computer extends Player{

    boolean firstMove;


    public Computer(String token) {

        super("Computer", token);

    }



    public int[] determineMove() {

        int column = (int )(Math.random() * 3);
        int row = (int )(Math.random() * 3);

        int[] move = {column,row};
        return move;


    }




}
