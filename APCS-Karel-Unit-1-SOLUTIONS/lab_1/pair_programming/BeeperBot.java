package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAllBeepers() {
        findFirstBeeper();
        pickTwoBeepers();
        findNextBeeper();
        pickTwoBeepers();
    }
    
    public void findFirstBeeper() {
        turnAround();
        move();
        move();
    }
    
    public void findNextBeeper() {
        //Assumes that karel is three steps above a beeper and facing East
        turnRight();
        moveThree();
        turnRight();
    }
    
    public void pickTwoBeepers() {
        pickBeeper();
        moveThree();
        pickBeeper();
    }
    
    public void moveThree() {
        move();
        move();
        move();
    }
    
    public void turnAround() {
        turnLeft();
        turnLeft();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
   
}
