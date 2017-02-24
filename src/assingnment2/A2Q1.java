/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assingnment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author bisef5371
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City wien = new City();
        Robot krazy = new Robot(wien, 1, 1, Direction.EAST);
        new Thing(wien, 1, 2);
        new Thing(wien, 1, 3);
        new Thing(wien, 1, 4);
        new Thing(wien, 1, 5);
        new Thing(wien, 1, 6);
        new Thing(wien, 1, 7);
        new Thing(wien, 1, 8);
        new Thing(wien, 1, 9);
        new Thing(wien, 1, 10);
        new Thing(wien, 1, 11);
        //while there are less than 7 things in backpack do this
        while (krazy.countThingsInBackpack() < 7) {
            krazy.move();
            krazy.pickThing();
        }
        krazy.move();
        //while bot can pick something up
        while (krazy.canPickThing()) {
            krazy.move();
        }
    }
}
