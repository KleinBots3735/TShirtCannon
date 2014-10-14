package team3735.templates;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;

public class RobotMap {
//PORT MAP
//PORTS ON DRIVER STATION LAPTOP
    static final int PILOTSTICK_PORT = 1; //P880 Controller
    static final int COPILOTSTICK_PORT = 2;    //Logitech Controller
//PORTS ON DIGITAL SIDECAR
    //PWM PORTS
        public static final Talon frontLeftMotor = new Talon(2);
        public static final Talon frontRightMotor = new Talon(4);
        public static final Talon rearLeftMotor = new Talon(1);
        public static final Talon rearRightMotor = new Talon(3);
        public static final Talon thetaMotor1 = new Talon(5);
        public static final Talon thetaMotor2 = new Talon(6);
    //DIGITAL PORTS    
    public static Compressor compressor = new Compressor(1,1);
    
    public static DigitalOutput barrelOne = new DigitalOutput (2);
    public static DigitalOutput barrelTwo = new DigitalOutput (3);
    public static DigitalOutput barrelThree = new DigitalOutput (4);
}            
