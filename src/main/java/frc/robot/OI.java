/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.servoScaleSetCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

  public Joystick gamepad;
  public JoystickButton goUp ;
  public JoystickButton goDown;
  public JoystickButton serv1_0;
  public JoystickButton serv1_180;
  public JoystickButton serv1_reset;


  public OI() {
    gamepad = new Joystick(0);
    serv1_0 = new JoystickButton(gamepad, 0);
    serv1_180 = new JoystickButton(gamepad, 1);
    serv1_reset = new JoystickButton(gamepad, 2);
    

    serv1_0.whenPressed(new servoScaleSetCommand(0.0));
    serv1_180.whenPressed(new servoScaleSetCommand(1.0));
    serv1_reset.whenPressed(new servoScaleSetCommand(0.5));
    //TODO remap joystick buttons
  }

}
