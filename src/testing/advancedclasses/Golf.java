/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing.advancedclasses;

/**
 *
 * @author e.pottinger
 */
public interface Golf extends Sports {
    
    void play(int hole, int score);
    
    void playOpponent(int hole, int score);
    
    void end(int hole);
    
}
