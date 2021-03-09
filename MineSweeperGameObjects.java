
/**
 * Write a description of class MineSweeperGameObjects here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class MineSweeperGameObjects
{
     int[][] myArray = { {0,0,0,0,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0},
                         {0,0,0,0,0},
                               };
     int numberOfMines = 0;
     int myArraySize = 5;
     
     public void printGameBoard() {
        System.out.println("Here is the minesweeper grid map.");
        for (int x = 0; x < myArraySize; x++) {
                for (int y = 0; y < myArraySize; y++) { 
                    if (y == 0)
                    {
                        System.out.print("*");
                    }
                    
                    int myInt = myArray[x][y];
                    
                    if (myInt == 9){
                        System.out.print("\uD83D\uDCA3");
                    }
                    else 
                    {
                        System.out.print(myInt);
                    }
                    
                    if (y == myArraySize -1)
                    {
                        System.out.print("*");
                    }
                }
                System.out.println("");
                
        }        
    }        
}