/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package team3735.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import team3735.templates.RobotMap;

/**
 *
 * @author Developer
 */
public class Theta extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void thetaUp() {
        RobotMap.thetaMotor1.set(1);
        RobotMap.thetaMotor2.set(1);
    }
    
    public void thetaDown() {
        RobotMap.thetaMotor1.set(-1);
        RobotMap.thetaMotor2.set(-1);
    }
    
    public void thetaStop() {
        RobotMap.thetaMotor1.set(0);
        RobotMap.thetaMotor2.set(0);
    }
}
