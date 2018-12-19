package example.game.gametools;

/**
 * Reactor.java - 
 * 
 * @author Ethan Pottinger
 * @since 19-Dec-2018
 */
public class Reactor {

    private Coordinates source;
    private Coordinates target;
    private int numberOfDirections;
    
    public Reactor(Coordinates source, int numberOfDirections) {
        this.source = source;
        this.numberOfDirections = numberOfDirections;
    }
    public void stickTo(GameObject gameObject) {
        if(numberOfDirections == Directions.TWO_DIRECTIONS || numberOfDirections == Directions.FOUR_DIRECTIONS) {
            if(source.direction == Directions.UP) stickToBottom(gameObject);
            else if(source.direction == Directions.DOWN) stickToTop(gameObject);
            else if(source.direction == Directions.LEFT) stickToRight(gameObject);
            else if(source.direction == Directions.RIGHT) stickToLeft(gameObject);
        }
    }
    public void stickToTop(GameObject gameObject) {
        target = gameObject.coordinates;
        source.y = target.top - source.height - 1;
        source.recalculate();
    }
    public void stickToBottom(GameObject gameObject) {
        target = gameObject.coordinates;
        source.y = target.bottom + 1;
        source.recalculate();
    }
    public void stickToRight(GameObject gameObject) {
        target = gameObject.coordinates;
        source.x = target.left + 1;
        source.recalculate();
    }
    public void stickToLeft(GameObject gameObject) {
        target = gameObject.coordinates;
        source.x = target.left - source.width - 1;
        source.recalculate();
    }
    public void bounceOff(GameObject gameObject) {
        stickTo(gameObject);
        if(numberOfDirections == Directions.TWO_DIRECTIONS || numberOfDirections == Directions.FOUR_DIRECTIONS) {
            if(source.direction == Directions.UP) source.direction = Directions.DOWN;
            else if(source.direction == Directions.DOWN) source.direction = Directions.UP;
            else if(source.direction == Directions.LEFT) source.direction = Directions.RIGHT;
            else if(source.direction == Directions.RIGHT) source.direction = Directions.LEFT;
        }
    }
    

}
