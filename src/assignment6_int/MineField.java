package assignment6_int;

import java.util.List;

/**
 * A MineField is regarded as a matrix of cells
 * 
 * @author SE_PS_WS2019
 */
public interface MineField {
          
    /**
     * Returns the minimum number of cells that must be visited on the 
     * shortest path between start and end cells (excluding both from the count).
     * Paths have only horizontal and vertical moves (no diagonals).
     * Returns -1 in case of error.
     */
    public int getShortestDistance(Cell start, Cell end);
        
    /**
     * Sets the type of paths for this mine field
     */
    public void setPathType(PathType pType);
    
    /**
     * Returns the cells of the shortest path between start and end according to 
     * the current setting of the path type for the field 
     * The number of elements in the list must be equal to the shortest distance
     * as defined above. The cells start and end must not be in the list.
     * Returns null if no path could be found (error, path does not exist, etc.)
     * 
     * Important: The implementation of this method must not depend on the type of path.
     * For example, no change must be done here when adding a new path type to the application.
     */
    public List<Cell> getShortestPath(Cell start, Cell end);

    /**
     * Size getter methods
     */
    int getNrOfLines();
    int getNrOfColumns();
}
