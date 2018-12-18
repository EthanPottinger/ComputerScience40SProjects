package example.game;

import globalmethods.GlobalMethods;

/**
 * Mover.java - 
 * 
 * @author Ethan Pottinger
 * @since 18-Dec-2018
 */
public class Mover {

    private Coordinates source;
    private int numberOfDirections;
    
    public Mover(Coordinates source, int numberOfDirections) {
        this.source = source;
        this.numberOfDirections = numberOfDirections;
    }
    public void stop() {
        source.direction = Directions.STOP;
    }
    public void moveUp() {
        source.y -= source.amount;
        source.recalculate();
        source.direction = Directions.UP;
    }
    public void moveDown() {
        source.y += source.amount;
        source.recalculate();
        source.direction = Directions.DOWN;
    }
    public void moveLeft() {
        source.x -= source.amount;
        source.recalculate();
        source.direction = Directions.LEFT;
    }
    public void moveRight() {
        source.x += source.amount;
        source.recalculate();
        source.direction = Directions.RIGHT;
    }
    public void moveNorth() {
        moveUp();
        source.direction = Directions.NORTH;
    }
    public void moveSouth() {
        moveDown();
        source.direction = Directions.SOUTH;
    }
    public void moveEast() {
        moveRight();
        source.direction = Directions.EAST;
    }
    public void moveWest() {
        moveLeft();
        source.direction = Directions.WEST;
    }
    public void moveNorthEast() {
        moveNorth();
        moveEast();
        source.direction = Directions.NORTH_EAST;
    }
    public void moveSouthEast() {
        moveSouth();
        moveEast();
        source.direction = Directions.SOUTH_EAST;
    }
    public void moveSouthWest() {
        moveSouth();
        moveWest();
        source.direction = Directions.SOUTH_WEST;
    }
    public void moveNorthWest() {
        moveNorth();
        moveWest();
        source.direction = Directions.NORTH_WEST;
    }
    public void move() {
        if(source.direction == Directions.STOP) stop();
        if(numberOfDirections == Directions.TWO_DIRECTIONS || 
           numberOfDirections == Directions.FOUR_DIRECTIONS) {
            if(source.direction == Directions.UP) moveUp();
            else if(source.direction == Directions.DOWN) moveDown();
            else if(source.direction == Directions.LEFT) moveLeft();
            else if(source.direction == Directions.RIGHT) moveRight();
        }
        else if(numberOfDirections == Directions.EIGHT_DIRECTIONS) {
            if(source.direction == Directions.NORTH) moveNorth();
            else if(source.direction == Directions.SOUTH) moveSouth();
            else if(source.direction == Directions.EAST) moveEast();
            else if(source.direction == Directions.WEST) moveWest();
            else if(source.direction == Directions.NORTH_WEST) moveNorthWest();
            else if(source.direction == Directions.NORTH_EAST) moveNorthEast();
            else if(source.direction == Directions.SOUTH_WEST) moveSouthWest();
            else if(source.direction == Directions.SOUTH_EAST) moveSouthEast();
        }    
    }
    public void moveRandom() {
        
    }
    
}
