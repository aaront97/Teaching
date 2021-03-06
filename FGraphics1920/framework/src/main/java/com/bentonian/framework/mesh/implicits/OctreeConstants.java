package com.bentonian.framework.mesh.implicits;

public class OctreeConstants {

  /*      010----------110          --------------          2------------6
   *     /|           /|           /|           /|         /|           /|
   *    / |          / |          / |   2      / |        / |          / |
   *   /  |         /  |         /  |     5   /  |       /  |         /  |
   *  011-----------111|        |-------------|  |      3-------------7  |
   *  |   |         |  |        | 1 |         |4 |      |   |         |  |
   *  |   000-------|--100      |   |---------|--|      |   0---------|--4
   *  |  /          |  /        |  /  0       |  /      |  /          |  /
   *  | /           | /         | /     3     | /       | /           | /
   *  |/            |/          |/            |/        |/            |/
   *  001-----------101         |-------------/         1-------------5
   *    Vertex codes              Face indices           Vertex indices
   *
   *   +-------11--------+          
   *   |\                |\         
   *   |  8              | 10       
   *   |    \            |    \     
   *   |     +---------9-------+    
   *   4     |           7     |    
   *   |     |           |     |    
   *   |     |           |     |    
   *   |     |           |     |    
   *   +-----5--3--------+     6    
   *    \    |            \    |    
   *      0  |              2  |    
   *        \|                \|    
   *         +---------1-------+    
   *      Edge indices
   */

  public static final int[][][] TETRAHEDRA = {
    { {0,0,0}, {0,1,1}, {1,0,1}, {1,1,0} },
    { {0,0,0}, {0,0,1}, {1,0,1}, {0,1,1} },
    { {1,1,0}, {0,1,1}, {1,0,1}, {1,1,1} },
    { {0,0,0}, {0,1,1}, {0,1,0}, {1,1,0} },
    { {0,0,0}, {1,0,0}, {1,0,1}, {1,1,0} },
  };

  public static final int[][][] FACES = {
    { {0,0,1}, {1,0,1}, {1,1,1}, {0,1,1} },
    { {0,1,0}, {0,0,0}, {0,0,1}, {0,1,1} },
    { {0,1,1}, {1,1,1}, {1,1,0}, {0,1,0} },
    { {0,0,1}, {1,0,1}, {1,0,0}, {0,0,0} },
    { {1,0,1}, {1,0,0}, {1,1,0}, {1,1,1} },
    { {1,0,0}, {0,0,0}, {0,1,0}, {1,1,0} },
  };

  public static final int[][][] EDGES = {
    { {0,0,0}, {0,0,1} },
    { {0,0,1}, {1,0,1} },
    { {1,0,1}, {1,0,0} },
    { {1,0,0}, {0,0,0} },
    { {0,0,0}, {0,1,0} },
    { {0,0,1}, {0,1,1} },
    { {1,0,1}, {1,1,1} },
    { {1,0,0}, {1,1,0} },
    { {0,1,0}, {0,1,1} },
    { {0,1,1}, {1,1,1} },
    { {1,1,1}, {1,1,0} },
    { {1,1,0}, {0,1,0} },
  };
}
