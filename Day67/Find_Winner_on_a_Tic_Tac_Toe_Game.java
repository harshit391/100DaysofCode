package Day67;

// Leetcode Problem 1275 

// Find Winner on a Tic Tac Toe Game

// Tic-tac-toe is played by two players A and B on a 3 x 3 grid. The rules of Tic-Tac-Toe are:

// Players take turns placing characters into empty squares ' '.
// The first player A always places 'X' characters, while the second player B always places 'O' characters.
// 'X' and 'O' characters are always placed into empty squares, never on filled ones.
// The game ends when there are three of the same (non-empty) character filling any row, column, or diagonal.
// The game also ends if all squares are non-empty.
// No more moves can be played if the game is over.
// Given a 2D integer array moves where moves[i] = [rowi, coli] indicates that the ith move will be played on grid[rowi][coli]. return the winner of the game if it exists (A or B). In case the game ends in a draw return "Draw". If there are still movements to play return "Pending".

// You can assume that moves is valid (i.e., it follows the rules of Tic-Tac-Toe), the grid is initially empty, and A will play first.

// Example 1:

// Input: moves = [[0,0],[2,0],[1,1],[2,1],[2,2]]
// Output: "A"
// Explanation: A wins, they always play first.

// My Solution
class Solution {
    public String tictactoe(int[][] moves) {
        
        int[][] board = new int[3][3];
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int d1 = 0;
        int d2 = 0;

        for(int i=0; i<moves.length; i++){
            if(i%2!=0){ //a turn
                board[moves[i][0]][moves[i][1]] = 1;
            }
            else{ //b turn
                board[moves[i][0]][moves[i][1]] = -1;
            }
        }

        for(int j=0; j<3; j++){
            r1 += board[0][j];
            r2 += board[1][j];
            r3 += board[2][j];
            c1 += board[j][0];
            c2 += board[j][1];
            c3 += board[j][2];
            d1 += board[j][j];
        }
        d2 = board[0][2] + board[1][1] + board[2][0];

        if(r1 == -3 || r2 == -3 || r3 == -3 || c1 == -3 || c2 == -3 || c3 == -3 || d1 == -3 || d2 == -3){
            return "A";
        }
        else if(r1 == 3 || r2 == 3 || r3 == 3 || c1 == 3 || c2 == 3 || c3 == 3 || d1 == 3 || d2 == 3){
            return "B";
        }
        else if(moves.length<9){
            return "Pending";
        }
        else{
            return "Draw";
        }
    }
}

public class Find_Winner_on_a_Tic_Tac_Toe_Game {
    
}
