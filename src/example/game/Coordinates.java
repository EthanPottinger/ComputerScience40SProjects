package example.game;

/**
 * Coordinates.java - 
 * 
 * @author Ethan Pottinger
 * @since 17-Dec-2018
 */
public class Coordinates {

    public int x, y, width, height, amount, direction, left, right, top, bottom, centerX, centerY;
    
    public Coordinates(int x, int y, int width, int height, int amount, int direction) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.amount = amount;
        this.direction = direction;
        recalculate();
    }
    public void recalculate() {
        left = x;
        top = y;
        right = left + width;
        bottom = top + height;
        centerX = x + (width / 2);
        centerY = y + (height / 2);
    }

}
