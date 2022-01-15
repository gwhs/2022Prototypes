package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class commands extends SequentialCommandGroup {
    public commands(TalonFX motor1, TalonFX motor2, double speed){
        super(new SpinMotor(motor1, speed),
              new SpinMotor(motor2, -speed) );
    }
}
