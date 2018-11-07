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
public interface PermissionForm {
    
    static final boolean SIGNED = true;
    
    static final boolean NOT_SIGNED = false;
    
    void signature();
    
    boolean signed();
    
}
