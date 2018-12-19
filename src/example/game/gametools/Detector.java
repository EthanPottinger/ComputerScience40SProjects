package example.game.gametools;

/**
 * Detector.java - 
 * 
 * @author Ethan Pottinger
 * @since 19-Dec-2018
 */
public class Detector {

    private Coordinates source;
    private Coordinates target;
    
    public Detector(Coordinates source) {
        this.source = source;
    }
    public boolean isOverLapping(GameObject gameObject) {
        if(isOverLappingVertically(gameObject) && isOverLappingHorizontally(gameObject)) return true;
        return false;
    }
    public boolean isOverLappingVertically(GameObject gameObject) {
        target = gameObject.coordinates;
        if(source.left >= target.left && source.left <= target.right) return true;
        if(source.right >= target.left && source.right <= target.right) return true;
        if(target.left >= source.left && target.left <= source.right) return true;
        if(target.right >= source.left && target.right <= source.right) return true;
        return false;
    }
    public boolean isOverLappingHorizontally(GameObject gameObject) {
        target = gameObject.coordinates;
        if(source.top >= target.top && source.top <= target.bottom) return true;
        if(source.bottom >= target.top && source.bottom <= target.bottom) return true;
        if(target.top >= source.top && target.top <= source.bottom) return true;
        if(target.bottom >= source.top && target.bottom <= source.bottom) return true;
        return false;
    }

}
