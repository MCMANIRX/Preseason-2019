package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Robot;

public class ServoSub extends Subsystem {

  @Override
    protected void initDefaultCommand() {

    }

    public void servoScaleSet(double scale) {

      Robot.robotmap.serv1.set(scale);

    }



}