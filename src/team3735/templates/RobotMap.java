package team3735.templates;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;    
    public static final int JOYSTICK_PORT = 1;
    public static final int CONTROL_PORT = 2;    
    
    public static final Talon frontLeftMotor = new Talon(2);
    public static final Talon frontRightMotor = new Talon(4);
    public static final Talon rearLeftMotor = new Talon(1);
    public static final Talon rearRightMotor = new Talon(3);
    public static final Talon thetaMotor1 = new Talon(5);
    public static final Talon thetaMotor2 = new Talon(6);
    //public static final Talon somethingMotor3 = new Talon(7);

    public static Solenoid shifterSolenoid = new Solenoid(8);
    
    public static Compressor compressor = new Compressor(1,1);
    
    public static DigitalOutput barrelOne = new DigitalOutput (2);
    public static DigitalOutput barrelTwo = new DigitalOutput (3);
    public static DigitalOutput barrelThree = new DigitalOutput (4);
    
    public static NetworkTable table = NetworkTable.getTable("");    
}            
