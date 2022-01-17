package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import com.ctre.phoenix.sensors.CANCoder;


public class SpinMotor extends CommandBase {
    private TalonFX moto;
    private double speed; // perscent output -1 -> 1

    public SpinMotor(TalonFX motor, double speed) {
        moto = motor;
        this.speed = speed;
        System.out.println();
    }

    @Override
    public void initialize() {
        
        
    }
    public TalonFX getMotor(){
        return moto;
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
