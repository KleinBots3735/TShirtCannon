/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package team3735.commands;

/**
 *
 * @author Developer
 */
public class driveWithJoy extends CommandBase {
    
    public driveWithJoy() {
        requires(drive);
    }

    protected void initialize() {
    }

    protected void execute() {
        drive.move(oi.getStickZ(),oi.getStickX());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
