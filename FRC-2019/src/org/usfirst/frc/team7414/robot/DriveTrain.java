package org.usfirst.frc.team7414.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveTrain {

	//assumes that we're using PWMTalon controllers
	private static PWMTalonSRX backLeft = new PWMTalonSRX(PortMap.driveBackLeft);
	private static PWMTalonSRX backRight = new PWMTalonSRX(PortMap.driveBackRight);
	private static PWMTalonSRX frontLeft = new PWMTalonSRX(PortMap.driveFrontLeft);
	private static PWMTalonSRX frontRight = new PWMTalonSRX(PortMap.driveFrontRight);

	private static SpeedControllerGroup leftSide = new SpeedControllerGroup(backLeft, frontLeft);
	private static SpeedControllerGroup rightSide = new SpeedControllerGroup(backRight, frontRight);
	
	private static DifferentialDrive drive = new DifferentialDrive(leftSide, rightSide);
}
