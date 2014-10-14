/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package team3735.commands;

import edu.wpi.first.wpilibj.DigitalOutput;

/**
 *
 * @author Developer
 */
public class shootCannon extends CommandBase {
    
    public static DigitalOutput barrel;
    
    public shootCannon(DigitalOutput b) {
        requires(cannon);
        barrel = b;
    }
    protected void initialize() {
    }
    protected void execute() {
       // cannon.shootBarrelOne();
        barrel.set(true);
        try{
            Thread.sleep(5000); //pause 5 seconds
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        barrel.set(false);
    }
    protected boolean isFinished() {
        return false;
    }
    protected void end() {
    }
    protected void interrupted() {
        
    }
}
