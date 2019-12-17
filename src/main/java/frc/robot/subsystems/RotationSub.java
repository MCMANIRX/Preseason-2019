package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;

public class RotationSub extends Subsystem{

    @Override
    protected void initDefaultCommand() {

    }

    public void rotate() {
    //TODO make sure gamepad is pulling from correct input
    Robot.robotmap.rotMotor.set(Robot.oi.gamepad.getRawAxis(1));
    }
}