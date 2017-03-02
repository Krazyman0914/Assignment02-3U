/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assingnment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author bisef5371
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREATING NEW CITY "WIEN"
        City wien = new City();
        //CREATING THE ROBOT "KRAZY"
        Robot krazy = new Robot(wien, 3, 1, Direction.EAST);
        //CREATING THE HURDLES
        new Wall(wien, 3, 1, Direction.SOUTH);
        new Wall(wien, 3, 2, Direction.SOUTH);
        new Wall(wien, 3, 2, Direction.EAST);
        new Wall(wien, 3, 3, Direction.SOUTH);
        new Wall(wien, 3, 3, Direction.EAST);
        new Wall(wien, 3, 4, Direction.SOUTH);
        new Wall(wien, 3, 5, Direction.SOUTH);
        new Wall(wien, 3, 5, Direction.EAST);
        new Wall(wien, 3, 6, Direction.SOUTH);
        new Wall(wien, 3, 7, Direction.SOUTH);
        new Wall(wien, 3, 7, Direction.EAST);
        new Wall(wien, 3, 8, Direction.SOUTH);
        new Wall(wien, 3, 9, Direction.SOUTH);
        new Wall(wien, 3, 9, Direction.EAST);
        new Wall(wien, 3, 10, Direction.SOUTH);
        new Wall(wien, 3, 11, Direction.SOUTH);
        //CREATING NEW THING
        new Thing(wien, 3, 11);
        //"while" statment to move
        while (true) {
            if (krazy.frontIsClear()) {
                krazy.move();
            } else {
                krazy.turnLeft();
                krazy.move();
                krazy.turnLeft();
                krazy.turnLeft();
                krazy.turnLeft();
                krazy.move();
                krazy.turnLeft();
                krazy.turnLeft();
                krazy.turnLeft();
                krazy.move();
                krazy.turnLeft();
            }

            if (krazy.canPickThing()) {
                break;
            }
        }
    }
}
