// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Constants;

/**
 * Add your docs here.
 */
public class Drivetrain implements Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  Talon leftFrontTalon = null;
  Talon leftBackTalon = null;
  Talon rightFrontTalon = null;
  Talon rightBackTalon = null;

  MotorControllerGroup leftMotors = null;
  MotorControllerGroup rightMotors = null;
  DifferentialDrive differentialDrive = null;

  public Drivetrain() {
    // Talons
    leftFrontTalon = new Talon(Constants.DRIVETRAIN_LEFT_FRONT_TALON);
    leftBackTalon = new Talon(Constants.DRIVETRAIN_LEFT_BACK_TALON);
    rightFrontTalon = new Talon(Constants.DRIVETRAIN_RIGHT_FRONT_TALON);
    rightBackTalon = new Talon(Constants.DRIVETRAIN_RIGHT_BACK_TALON);

    leftMotors = new MotorControllerGroup(leftFrontTalon, leftBackTalon);
    rightMotors = new MotorControllerGroup(rightFrontTalon, rightBackTalon);
    differentialDrive = new DifferentialDrive(leftMotors, rightMotors);
  }

  public void arcadeDrive(double moveSpeed, double rotateSpeed){
    differentialDrive.arcadeDrive(moveSpeed, rotateSpeed);
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
