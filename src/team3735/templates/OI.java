
package team3735.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import team3735.commands.angleDown;
import team3735.commands.angleUp;
import team3735.commands.shootCannon;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    public static Joystick PILOT_CONTROLLER = new Joystick(RobotMap.PILOTSTICK_PORT);
    public static Joystick COPILOT_CONTROLLER = new Joystick(RobotMap.COPILOTSTICK_PORT);
    
    public Button one = new JoystickButton(PILOT_CONTROLLER,1);
    public Button two = new JoystickButton(PILOT_CONTROLLER,2);
    public Button three = new JoystickButton(PILOT_CONTROLLER,3);
    public Button four = new JoystickButton(PILOT_CONTROLLER,4);
    public Button five = new JoystickButton(PILOT_CONTROLLER,5);
    public Button six = new JoystickButton(PILOT_CONTROLLER,6);
    public Button seven = new JoystickButton(PILOT_CONTROLLER,7);
    public Button eight = new JoystickButton(PILOT_CONTROLLER,8);
    
//    
    public OI () {
       one.whenPressed(new shootCannon(RobotMap.barrelOne));
       two.whenPressed(new shootCannon(RobotMap.barrelTwo));
       three.whenPressed(new shootCannon(RobotMap.barrelThree));
       five.whileHeld(new angleUp());
       six.whileHeld(new angleDown());
    }
    
    public Joystick getStick()
    {
        return PILOT_CONTROLLER;
    }
    public double getStickX()
    {
        return PILOT_CONTROLLER.getX();
    }
    public double getStickY()
    {
        return PILOT_CONTROLLER.getY();
    }   
    public double getStickZ()
    {
        return PILOT_CONTROLLER.getZ();
    }
}

