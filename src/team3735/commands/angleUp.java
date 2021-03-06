/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package team3735.commands;

/**
 *
 * @author Developer
 */
public class angleUp extends CommandBase {
    
    public angleUp() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(angle);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        angle.thetaUp();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        angle.thetaStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        angle.thetaStop();
    }
}
