# A6_WS2019

Assignment 6: The Strategy Design Pattern
----------------------------------------------

Read the provided starter code.

Implement the given interfaces as described in the comments therein, in order to support path types MIN_MINES and MAX_MINES. Use the Strategy Design Pattern. 

**Bonus:**
Add support for the SAFEST path type.

Example
------------------
Input:
 ```
6 7
..*.*..
..*..*.
.......
.......
.......
....*..

 ```
Code snippet:

 ```java
        MineField mField = a6FieldGen.loadFieldFromFile(infile, PathType.MIN_MINES);
        Cell c00 = new A6Cell(0,0);
        Cell c14 = new A6Cell(1,4);
        Cell c36 = new A6Cell(3,6);
        int distance1 = mField.getShortestDistance(c00, c14); // should return 4
        int distance2 = mField.getShortestDistance(c00, c36); // should return 8

        List<Cell> path;
        path = mField.getShortestPath(c00, c14); 
        // (1,0)->(1,1)->(1,2)->(1,3) has one mine
        // any shortest path with one mine on it is ok
        
        path = mField.getShortestPath(c14, c36); 
        // (2,4)->(3,4)->(3,5) has no mine. Others have also no mine.
        
        mField.setPathType(PathType.MAX_MINES);
        path = mField.getShortestPath(c00, c14); 
        // (0,1)->(0,2)->(0,3)->(0,4) is one of the shortest paths with two mines
        
        path = mField.getShortestPath(c00, c36);
        // there are several paths with 3 mines, one of them is
        // (0,1)->(0,2)->(0,3)->(0,4)->(0,5)->(1,5)->(1,6)->(2,6)
       
        // for the bonus part:
        mField.setPathType(PathType.SAFEST);
        path = mField.getShortestPath(c00, c36);
        // only one path is two steps away from any mine:
        // (1,0)->(2,0)->(3,0)->(3,1)->(3,2)->(3,3)->(3,4)->(3,5)
        // any other shortest path has a cell that is at most 1 step from a mine

```