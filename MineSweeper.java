
/**
 * Write a description of class MineSweeper here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class MineSweeper
{
    public static void main(String[] args) {
    System.out.print("\u000C");
    
    MineSweeperGameObjects theSolutionGrid = new MineSweeperGameObjects();   // Create a new object to hold the solution grid
    theSolutionGrid.setValueAtPosition(0,0,9); // Set a mine at position 0,0        
    theSolutionGrid.setValueAtPosition(1,1,9); // Set a mine at position 1,1    
    theSolutionGrid.setValueAtPosition(2,2,9); // Set a mine at position 2,2   
    theSolutionGrid.setValueAtPosition(3,3,9); // Set a mine at position 3,3   
    theSolutionGrid.setValueAtPosition(4,4,9); // Set a mine at position 4,4
    
    MineSweeperGameObjects theUserGrid = new MineSweeperGameObjects();   // Create a new object to hold the user grid
    
    MineSweeperGameObjects theTestGrid = new MineSweeperGameObjects();   // Create a new object to hold the solution test
            
    Scanner myScanner = new Scanner(System.in);
    
    boolean gameOver = false;
    int mineTracker1 = 0;
    int mineTracker2 = 0;

    do 
        {        
            System.out.println("Player 1: Enter Row space Column starting at upper left corner as 0,0.");
            int row = myScanner.nextInt();
            int column = myScanner.nextInt();
            int value = theSolutionGrid.getValueAtPosition(row,column);
            theUserGrid.setValueAtPosition(row,column,value);
            if (theUserGrid.hitAMine(row,column))
            {
                theUserGrid.printGrid();
                mineTracker1++;
                if (mineTracker1 == 3)
                {
                    System.out.println("Player 1, you hit three mines! You lost!");
                    gameOver = true;
                }
                else if (theTestGrid.isGridFilled())
                {
                     System.out.println("Congratulations Player 1! You just beat the minesweeper game! \uD83D\uDE00");
                     theSolutionGrid.printGrid();
                     gameOver = true;
                }
            }
            else
            {
                int numberOfMines = theSolutionGrid.getNumberOfMinesNearPosition(row,column);
                theUserGrid.setValueAtPosition(row,column,numberOfMines);
                theUserGrid.printGrid();
            }
            
            if (gameOver == false)
            {
                System.out.println("Player 2: Enter Row space Column starting at upper left corner as 0,0.");
                row = myScanner.nextInt();
                column = myScanner.nextInt();
                value = theSolutionGrid.getValueAtPosition(row,column);
                theUserGrid.setValueAtPosition(row,column,value);
                if (theUserGrid.hitAMine(row,column))
                {
                    mineTracker2 = mineTracker2 + 2;
                    theUserGrid.printGrid();
                    if (mineTracker2 == 3)
                    {
                        System.out.println("Player 2, you hit three mines! You lost!");
                        gameOver = true;
                    }
                    else if (theTestGrid.isGridFilled())
                    {
                        System.out.println("Congratulations Player 2! You just beat the minesweeper game! \uD83D\uDE00");
                        theSolutionGrid.printGrid();
                        gameOver = true;
                    }
                }
                else
                {
                    int numberOfMines = theSolutionGrid.getNumberOfMinesNearPosition(row,column);
                    theUserGrid.setValueAtPosition(row,column,numberOfMines);
                    theUserGrid.printGrid();
                }
            }        
        }
        while (gameOver == false);

  }
}
