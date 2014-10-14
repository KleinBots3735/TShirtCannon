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

    RobotDrive drive = new RobotDrive(RobotMap.frontLeftMotor,RobotMap.rearLeftMotor,RobotMap.frontRightMotor, RobotMap.rearRightMotor);

    public Drivetrain()
    {
    }
    public void move(double y, double x)
    {
        drive.arcadeDrive(y,x,false);
    }
    public void initDefaultCommand() {
        setDefaultCommand(new driveWithJoy());
    }
}
