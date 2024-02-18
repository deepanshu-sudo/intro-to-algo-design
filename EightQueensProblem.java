/*
 * Problem Description:
 * The eight queens problem is a classic puzzle in which one has to place eight queens on a chessboard such that no two queens can attack each other. This means that no two queens can share the same row, column, or diagonal on the board. The problem is to find all possible solutions or configurations for placing the eight queens. 
 * 
 * Solution:
---------------
. Q . . . . . .
. . . . Q . . .
. . . . . . . Q
. . . . . Q . .
Q . . . . . . .
. . Q . . . . .
. . . . . . Q .
. . . Q . . . .
---------------
 * Approach:
 * 
 * Algorithm:
 * 
 * Pseudocode:
 * 
 */

public class EightQueensProblem {
    //creating a 2d Array
    int[][] board;

    //constructor
    EightQueensProblem(int boardRange) {
        board = new int[boardRange][boardRange];

        //populating the 2d array with zeroes
        for(int i = 0; i < boardRange; i++) {
            for(int j = 0; j < boardRange; j++) {
                board[i][j] = 0;
            }
        }
    }

    //method to check if the queen can be placed to the given position
    //without threatening other queens
    public void canBePlaced() {
        //check if there is a queen in the same row to the left

        //check if ther eis 
    }
    
    public static void main(String[] args) {
        
    }
}