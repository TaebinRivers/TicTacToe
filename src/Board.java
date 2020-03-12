/**
 * Created by h205p4 on 2/27/20.
 */
public class Board {
    int round = 0;
    int size = 3;
    String[][] board = new String[3][3];

    public Board() {

        //String[][] board = new String[3][3];
        resetBoard();


    }


    public void determineWin() {
        boolean oWin = false;
        boolean xWin = false;
        //check if the first row going down has a three in a row
        if((board[0][0].equals(board[0][1])) && (board[0][0].equals(board[0][2])) && (board[0][0].equals("O"))) {

            oWin = true;

        } else if((board[0][0].equals(board[0][1])) && (board[0][0].equals(board[0][2])) && (board[0][0].equals("X"))) {

            xWin = true;

        }
        //check  to see if the second row has a three in a row
        if((board[1][0].equals(board[1][1])) && (board[1][0].equals(board[1][2])) && (board[1][0].equals("O"))) {

            oWin = true;

        }else if ((board[1][0].equals(board[1][1])) && (board[1][0].equals(board[1][2])) && (board[1][0].equals("X"))) {

            xWin = true;

        }
        //check to see if the third row has a three in a row, and if so return win
        if((board[3][0].equals(board[3][1])) && (board[3][0].equals(board[3][2])) && (board[3][0].equals("O"))) {

            oWin = true;

        }else if((board[3][0].equals(board[3][1])) && (board[3][0].equals(board[3][2])) && (board[3][0].equals("X"))) {

            xWin = true;

        }
        //check to see if the first column has a three in a row
        if((board[0][0].equals(board[1][0])) && (board[0][0].equals(board[2][0])) && (board[0][0].equals("O"))) {

            oWin = true;

        }else if((board[0][0].equals(board[1][0])) && (board[0][0].equals(board[2][0])) && (board[0][0].equals("X"))) {

            xWin = true;

        }
        //checck to see if the second column has a three in a row
        if((board[0][1] == board[1][1]) && (board[0][1] == board[2][1]) && (board[0][1] == "O")) {

            oWin = true;

        }else if((board[0][1] == board[1][1]) && (board[0][1] == board[2][1]) && (board[0][1] == "X")) {

            xWin = true;

        }
        //check to see if the third column has a three in a row
        if((board[0][2] == board[1][2]) && (board[0][2] == board[2][2]) && (board[0][2] == "O")) {

            oWin = true;

        }else if((board[0][2] == board[1][2]) && (board[0][2] == board[2][2]) && (board[0][2] == "O")) {

            xWin  = true;

        }


    }

    public String[][] getBoard() {
        return board;
    }

    public Boolean isLegalMove(int column, int row) {
        if(board[column][row] == "") {

            return true;

        }else {

            return false;

        }

    }


    public void printBoard() {

        for(int row = 0; row < size; row++) {

            for(int column = 0; column < size; column++) {

                System.out.println(board[row][column]);

            }

        }

    }
    public void resetBoard() {
    //sets the board to be a clean board ie no spots filled

        board[0][0] = "";
        board[0][1] = "";
        board[0][2] = "";
        board[1][0] = "";
        board[1][1] = "";
        board[1][2] = "";
        board[2][0] = "";
        board[2][1] = "";
        board[2][2] = "";

    }
    public boolean legalMove(int row, int column) {

        if(board[row][column] == "") {

            return true;

        }else {

            return false;

        }

    }

    public void move(int row, int column) {



    }


}
