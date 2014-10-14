/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package team3735.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import team3735.templates.OI;
import team3735.templates.RobotMap;
import team3735.commands.driveWithJoy;

/**
 *
 * @author Developer
 */
public class Drivetrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    RobotDrive drive = new RobotDrive(RobotMap.frontLeftMotor,RobotMap.rearLeftMotor,RobotMap.frontRightMotor, RobotMap.rearRightMotor);

    public Drivetrain()
    {
    }
    public void driveWithJoy(double y, double x)
    {
        drive.arcadeDrive(y,x,false);
    }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new driveWithJoy());
    }
}
