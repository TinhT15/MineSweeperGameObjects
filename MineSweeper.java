
/**
 * Write a description of class MineSweeper here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MineSweeper
{
    public static void main(String[] args) {
    MineSweeperGameObjects theSolutionGrid = new MineSweeperGameObjects();   // Create a new object to hold the solution grid
    theSolutionGrid.printGrid();      // Call the printGameBoard() method
    theSolutionGrid.setValueAtPosition(0,0,9); // Set a mine at position 0,0        
    theSolutionGrid.setValueAtPosition(1,1,9); // Set a mine at position 1,1    
    theSolutionGrid.setValueAtPosition(2,2,9); // Set a mine at position 2,2   
    theSolutionGrid.setValueAtPosition(3,3,9); // Set a mine at position 3,3   
    theSolutionGrid.setValueAtPosition(4,4,9); // Set a mine at position 4,4
    theSolutionGrid.getNumberOfMines(1,0);   //Get the number of mines around position x,y
    theSolutionGrid.isGridFilled(); 
    theSolutionGrid.printGrid();      // See what the grid looks like
    
    MineSweeperGameObjects theUserGrid = new MineSweeperGameObjects();   // Create a new object to hold the user grid
    
    MineSweeperGameObjects theTestGrid = new MineSweeperGameObjects();   // Create a new object to hold the solution test

  }
}
