/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assingnment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author bisef5371
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CREATING NEW CITY "WIEN"
        City wien = new City();
        //CREATING NEW ROBOT "KRAZY"
        Robot krazy = new Robot(wien, -46, 54, Direction.EAST);
        
        while(krazy.getStreet() < 0 ){
        //TURN UNTIL FACING SOUTH
        while (!(krazy.getDirection() == Direction.SOUTH)){
            krazy.turnLeft();
        }
            krazy.move();
        }
        while(krazy.getStreet() > 0 ){
        //TURN UNTIL FACING NORTH
        while (!(krazy.getDirection() == Direction.NORTH)){
            krazy.turnLeft();
        }
            krazy.move();
        }
        while(krazy.getAvenue() < 0 ){
        //TURN UNTIL FACING EAST
        while (!(krazy.getDirection() == Direction.EAST)){
            krazy.turnLeft();
        }
            krazy.move();
        }
        while(krazy.getAvenue() > 0 ){
        //TURN UNTIL FACING WEST
        while (!(krazy.getDirection() == Direction.WEST)){
            krazy.turnLeft();
        }
            krazy.move();
        }


    }
}
