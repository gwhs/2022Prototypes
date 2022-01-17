// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.SpinMotor;

import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.sensors.CANCoder;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class motor extends SubsystemBase {
  private TalonFX motor;

  /** Creates a new motor. */
  public motor() {
    motor = new TalonFX(8);
    motor.setSelectedSensorPosition(0.0);


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler 
    System.out.println(motor.getSelectedSensorPosition());

    }

  public TalonFX getMotor(){
    return motor;
  }
  }
