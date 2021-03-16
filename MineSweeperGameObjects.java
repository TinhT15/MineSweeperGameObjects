
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
     int myArraySize = 5;
     
     public void printGrid() {
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
    
    public int getNumberOfMines(int x, int y){
        int numberOfMines = 0;
        for (int i = 0; i < myArraySize; i++) {
                for (int j = 0; j < myArraySize; j++) { 
                    
                    if (j == y-1)
                    {
                        if (i == x-1 || i == x || i == x+1)
                        {
                            if (myArray[i][j] == 9)
                            {
                                numberOfMines++;
                            }
                        }
                    }
                    else if (j == y)
                    {
                        if (i == x-1 || i == x+1)
                        {
                            if (myArray[i][j] == 9)
                            {
                                numberOfMines++;
                            }
                        }
                    }
                    else if (j == y+1)
                    {
                        if (i == x-1 || i == x || i == x+1)
                        {
                            if (myArray[i][j] == 9)
                            {
                                numberOfMines++;
                            }
                        }
                    }                   
                }
        }
        return numberOfMines;
    }    
    
    public boolean isGridFilled(){
          for (int x = 0; x < myArraySize; x++) {
                for (int y = 0; y < myArraySize; y++) { 
                    
                    int myInt = myArray[x][y];
                    
                    if (myInt == 0){
                        //0 means not filled
                        return false;
                    }
                }
          }
          return true;
    }
    
    public void setValueAtPosition(int x, int y, int value){
        myArray[x][y] = value;
    }
    
    public int getValueAtPosition(int x, int y){
        return myArray[x][y];
    }
    
    public boolean hitAMine(int x, int y){
        if (myArray[x][y] == 9)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}