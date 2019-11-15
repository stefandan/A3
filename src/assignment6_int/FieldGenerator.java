package assignment6_int;

import java.io.File;

/**
 * Creates a field and sets the initial path type for the field.
 * @author SE_PS_WS2019
 * 
 */
public interface FieldGenerator {
    
    /**
     * Loads from file with same format as in Assignment 1 (first field only).
     */
    public MineField loadFieldFromFile(File inputFile, PathType pType);
    
    /**
     * Field with random mines 
     * 
     * Returns a field with mines randomly placed
     * Returns null if field could not be created
     *   
     * Uncomment for bonus!  
     */
    //public MineField randomMineField(int nrLines, int nrColumns, PathType pType);
}
