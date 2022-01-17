package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class SpinMotor extends CommandBase {
    private TalonFX moto;
    private double speed; // perscent output -1 -> 1

    public SpinMotor(TalonFX motor, double speed) {
        moto = motor;
        this.speed = speed;
    }

    @Override
    public void initialize() {
        
    }

    @Override
    public void execute() {
        moto.set(ControlMode.PercentOutput, speed);
    }

    @Override
    public void end(boolean interrupted) {

    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
