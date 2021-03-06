package org.usfirst.frc.team2713.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// Motors
	public static final int frontLeft = 1;
	public static final int frontRight = 2;
	public static final int backLeft = 3;
	public static final int backRight = 4;
	
	// Controllers
  public static final int BACKUP_XBOX_PORT = 0;
  public static final int BACKUP_ATTACK_PORT = 1;
  public static final String XBOX_NAME = "Controller (XBOX 360 For Windows)";
  public static final String FIGHT_NAME = "Mayflash Arcade Stick";
	
	// Sensors
  
  // SmartDash Settings
  
  // Measurements (metric / meters, unless specified)
  public static double WHEEL_DIAMETER = .5; // TODO Diameter of PART_NUMBER
  
  // Misc
  public static int ledPort = 50;
}
