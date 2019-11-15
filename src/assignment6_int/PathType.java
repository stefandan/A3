package assignment6_int;

/**
 * Types of paths in a mine field. All paths are shortest paths.
 * MIN_MINES: with a minimum number of mines on it
 * MAX_MINES: with a maximum number of mines on the path
 * SAFEST: as far away from mines as possible (including diagonal distance)
 * A path is safest if every other path gets closer to some mine (or at least as close).
 * 
 * It is expected that more path types will be added in the future
 * 
 * @author SE_PS_WS2019
 * 
 */

public enum PathType {
    MIN_MINES,
    MAX_MINES,
    SAFEST
}
