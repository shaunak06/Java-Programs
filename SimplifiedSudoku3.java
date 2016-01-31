/*********************************************************/
/*                                                       */
/* An applet to demonstrate recursion and backtracking   */
/* ===================================================   */
/*                                                       */
/* V0.3   18-MAR-2007  P. Tellenbach   www.heimetli.ch   */
/*                                                       */
/*********************************************************/
import java.applet.* ;
import java.awt.* ;
import java.io.*;
import java.util.StringTokenizer;

/**
 * Solves a sudoku puzzle by recursion and backtracking
 */
public class SimplifiedSudoku3 extends Applet implements Runnable
{
  /** The model */
  protected int model[][] ;
  
  /** The view */
  protected Button view[][] ;
  
  /** Solution File */
  
  /** Creates the model and sets up the initial situation */
  protected void createModel()
  {
    model = new int[16][16] ;
    
    // Clear all cells
    for( int row = 0; row < 16; row++ )
      for( int col = 0; col < 16; col++ )
      model[row][col] = 0 ;
    try {
     FileReader f = new FileReader("solution.txt");
     BufferedReader b = new BufferedReader(f);
     StringTokenizer theCells = new StringTokenizer(b.readLine(), ", ");
     
     // Create the initial situation
     while(theCells.hasMoreTokens())
     {
       model[Integer.parseInt(theCells.nextToken())][Integer.parseInt(theCells.nextToken())] = Integer.parseInt(theCells.nextToken());
     }
     b.close();
     f.close();
     for( int row = 0; row < 16; row++ ) {
         for( int col = 0; col < 16; col++ )
          System.out.printf("%d:",model[row][col]);
         System.out.printf("\n");
     }
    
    } catch (Exception e) {
     e.printStackTrace();
    }
  }
  
  /* Creates an empty view */
  protected void createView()
  {
    setLayout( new GridLayout(16,16) ) ;
    
    view = new Button[16][16] ;
    
    // Create an empty view
    for( int row = 0; row < 16; row++ )
      for( int col = 0; col < 16; col++ )
    {
      view[row][col]  = new Button() ;
      add( view[row][col] ) ;
    }
  }
  
   /* Updates the view from the model */
   protected void updateView()
      {
      for( int row = 0; row < 16; row++ )
         for( int col = 0; col < 16; col++ )
      {
            if( model[row][col] != 0 )
               view[row][col].setLabel( String.valueOf(model[row][col]) ) ;
            else
               view[row][col].setLabel( "" ) ;
            if(model[row][col]==1)
            {
              view[row][col].setBackground(Color.GREEN);
              view[row][col].setForeground(Color.BLACK);
            }
            if(model[row][col]==2)
            {
              view[row][col].setBackground(Color.RED);
              view[row][col].setForeground(Color.BLACK);
            }
            if(model[row][col]==3)
            {
              view[row][col].setBackground(Color.MAGENTA);
              view[row][col].setForeground(Color.BLACK);
            }
            if(model[row][col]==4)
            {
              view[row][col].setBackground(Color.BLUE);
              view[row][col].setForeground(Color.BLACK);
            }
            if(model[row][col]==5)
            {
              view[row][col].setBackground(Color.YELLOW);
              view[row][col].setForeground(Color.BLACK);
            }
            if(model[row][col]==6)
            {
              view[row][col].setBackground(Color.PINK);
              view[row][col].setForeground(Color.BLACK);
            }
            if(model[row][col]==7)
            {
              view[row][col].setBackground(Color.CYAN);
              view[row][col].setForeground(Color.BLACK);
            }
            if(model[row][col]==8)
            {
              view[row][col].setBackground(Color.ORANGE);
              view[row][col].setForeground(Color.BLACK);
            }
            if(model[row][col]==9)
            {
              view[row][col].setBackground(Color.GRAY);
              view[row][col].setForeground(Color.BLACK);
            }
            if(model[row][col]==10)
            {
              view[row][col].setBackground(Color.LIGHT_GRAY);
              view[row][col].setForeground(Color.BLACK);
            }
            if(model[row][col]==11)
            {
              view[row][col].setBackground(Color.GREEN);
              view[row][col].setForeground(Color.BLACK);
            }
            if(model[row][col]==12)
            {
              view[row][col].setBackground(Color.GREEN);
              view[row][col].setForeground(Color.BLACK);
            }
            if(model[row][col]==13)
            {
              view[row][col].setBackground(Color.GREEN);
              view[row][col].setForeground(Color.BLACK);
            }
            if(model[row][col]==14)
            {
              view[row][col].setBackground(Color.GREEN);
              view[row][col].setForeground(Color.BLACK);
            }
            if(model[row][col]==15)
            {
              view[row][col].setBackground(Color.GREEN);
              view[row][col].setForeground(Color.BLACK);
            }
            if(model[row][col]==16)
            {
              view[row][col].setBackground(Color.GREEN);
              view[row][col].setForeground(Color.BLACK);
            }
              
              
      }
    }
  
  /* This method is called by the browser when the applet is loaded */
  public void init()
  {
    createModel() ;
    createView() ;
    updateView() ;
  }
  
  /* Checks if num is an acceptable value for the given row */
  protected boolean checkRow( int row, int num )
  {
    for( int col = 0; col < 16; col++ )
      if( model[row][col] == num )
      return false ;
    
    return true ;
  }
  
  /* Checks if num is an acceptable value for the given column */
  protected boolean checkCol( int col, int num )
  {
    for( int row = 0; row < 16; row++ )
      if( model[row][col] == num )
      return false ;
    
    return true ;
  }
  
  /* Checks if num is an acceptable value for the box around row and col */
  protected boolean checkBox(int row, int col, int num )
  {
    row = (row / 4) * 4 ;
    col = (col / 4) * 4 ;
    
    for( int r = 0; r < 4; r++ )
      for( int c = 0; c < 4; c++ )
      if( model[row+r][col+c] == num )
      return false ;
    
    return true ;
  }
  
  /* This method is called by the browser to start the applet */
  public void start()
  {
    // This statement will start the method 'run' to in a new thread
    (new Thread(this)).start() ;
  }
  
  /* The active part begins here */
  public void run()
  {
    try
    {
      // Let the observers see the initial position
      Thread.sleep( 100 ) ;
      
      // Start to solve the puzzle in the left upper corner
      solve( 0, 0 ) ;
    }
    catch( Exception e )
    {
    }
  }
  
  /* Recursive function to find a valid number for one single cell */
  public void solve( int row, int col ) throws Exception
  {
    System.out.printf("in solve(%d, %d)\n",row,col);
    // Throw an exception to stop the process if the puzzle is solved
    if( row > 15 )
      throw new Exception( "Solution found" ) ;
    
    // If the cell is not empty, continue with the next cell
    if( model[row][col] != 0 )
      next( row, col ) ;
    else
    {
      // Find a valid number for the empty cell
      for( int num = 1; num < 17; num++ )
      {
        if( checkRow(row,num) && checkCol(col,num) && checkBox(col,row,num) )
        {
          model[row][col] = num ;
          updateView() ;
          
          // Let the observer see it
          Thread.sleep( 100 ) ;
          
          // Delegate work on the next cell to a recursive call
          next( row, col) ;
        }
      }
      
      // No valid number was found, clean up and return to caller
      model[row][col] = 0 ;
      updateView() ;
    }
  }
  
  /* Calls solve for the next cell */
  public void next( int row, int col ) throws Exception
  {
    System.out.printf("in next(%d, %d)\n",row,col);
    if( col < 15 )
      solve( row + 1, col ) ;
    else
      solve( 0, col + 1 ) ;
  }
}
