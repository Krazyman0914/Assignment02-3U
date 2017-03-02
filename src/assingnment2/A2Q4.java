/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assingnment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author bisef5371
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREATING NEW CITY "WIEN"
        City wien = new City();
        //CREATING NEW ROBOT "KRAZY"
        Robot krazy = new Robot(wien, 4, 2, Direction.WEST);
        //CREATING WALL SQUARE IN UPPER LEFT
        new Wall(wien, 1, 1, Direction.NORTH);
        new Wall(wien, 1, 1, Direction.EAST);
        new Wall(wien, 1, 1, Direction.SOUTH);
        new Wall(wien, 1, 1, Direction.WEST);
        //CREATING WALL SQUARE IN UPPER RIGHT
        new Wall(wien, 1, 4, Direction.NORTH);
        new Wall(wien, 1, 4, Direction.EAST);
        new Wall(wien, 1, 4, Direction.SOUTH);
        new Wall(wien, 1, 4, Direction.WEST);
        //CREATING WALL SQUARE IN LOWER LEFT
        new Wall(wien, 4, 1, Direction.NORTH);
        new Wall(wien, 4, 1, Direction.EAST);
        new Wall(wien, 4, 1, Direction.SOUTH);
        new Wall(wien, 4, 1, Direction.WEST);
        //CREATING WALL SQUARE IN LOWER RIGHT
        new Wall(wien, 4, 4, Direction.NORTH);
        new Wall(wien, 4, 4, Direction.EAST);
        new Wall(wien, 4, 4, Direction.SOUTH);
        new Wall(wien, 4, 4, Direction.WEST);
        //CREATING WALL SQUARE IN CENTER
        new Wall(wien, 2, 2, Direction.NORTH);
        new Wall(wien, 2, 2, Direction.WEST);
        new Wall(wien, 2, 3, Direction.NORTH);
        new Wall(wien, 2, 3, Direction.EAST);
        new Wall(wien, 3, 2, Direction.WEST);
        new Wall(wien, 3, 2, Direction.SOUTH);
        new Wall(wien, 3, 3, Direction.EAST);
        new Wall(wien, 3, 3, Direction.SOUTH);
        //loop to move around the figure
        while(true){
        krazy.turnLeft();
        krazy.move();
        krazy.turnLeft();
        krazy.turnLeft();
        krazy.turnLeft();
        krazy.move();
        krazy.move();
        krazy.turnLeft();
        krazy.turnLeft();
        krazy.turnLeft();
        krazy.move();
        krazy.move();
        krazy.turnLeft();
        krazy.turnLeft();
        krazy.turnLeft();
        krazy.move();
        krazy.turnLeft();
        krazy.move();
        
        }
    }
}
