/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package team3735.subsystems;

import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Developer
 */
public class Cannons extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void shootBarrel(DigitalOutput barrel) //specify barrel. real code
    {
        barrel.set(true);
        try{
            Thread.sleep(5000); //pause 5 seconds
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        barrel.set(false);
    }   
}
