package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.*;

public class RobotTemplate extends IterativeRobot {

    //stickOne
    final int SONE_HIGH_SPEED = 1;
    final int SONE_POKE_OPEN_GRIPPER = 2;
    final int SONE_GRIPPER_POKER_AXIS = 3;

    //stickTwo
    final int STWO_HIGH_SPEED = 1;
    final int STWO_BALL_ARM_UPPER = 2;
    final int STWO_KNOCK_BAR_AXIS = 3;

    //stickThree
    final int STHREE_GRIPPER = 1;
    final int STHREE_BALL_ARM_LOWER = 4;
    final int STHREE_VERTICAL_ARM = 11;
    final int STHREE_KNOCK_BAR_POKER = 9;

    Joystick stickOne = new Joystick(1);
    Joystick stickTwo = new Joystick(2);
    Joystick stickThree = new Joystick(3);

    Victor vicRight = new Victor(1);
    Victor vicLeft = new Victor(2);

    /*Encoder encRight = new Encoder(1, 16);
    Encoder encLeft = new Encoder(2, 17);

    DigitalInput compressorPressure = new DigitalInput(18);

    Relay transShift = new Relay(1);
    Relay verticalArm = new Relay(2);
    Relay knockBar = new Relay(3);
    Relay knockBarPoker = new Relay(4);
    Relay ballGripper = new Relay(5);
    Relay ballGripperPoker = new Relay(6);
    //Ball arm lower/upper pneumatic - relay 7 +/-
    Relay compressorPower = new Relay(8);

    Gyro gyro = new Gyro(1);

    AnalogChannel lapIndicator = new AnalogChannel(2);*/

    public void robotInit() {

    }

    //Runs at the beginning of disabled mode
    public void disabledInit() {
        /*transShift.set(Relay.Value.kOff);
        ballGripper.set(Relay.Value.kOff);
        ballGripperPoker.set(Relay.Value.kOff);
        verticalArm.set(Relay.Value.kOff);
        knockBar.set(Relay.Value.kOff);
        knockBarPoker.set(Relay.Value.kOff);
        compressorPower.set(Relay.Value.kOff);*/
    }

    //Runs at the beginning of autonomous mode
    public void autonomousInit () {
        
    }

    //Runs periodically during autonomous mode
    public void autonomousPeriodic() {

    }

    //Runs continuously during autonomous mode
    public void autonomousContinuous() {

    }

    //Runs at the beginning of teleoperated mode
    public void teleopInit() {
        /*transShift.set(Relay.Value.kOn);
        ballGripper.set(Relay.Value.kOn);
        ballGripperPoker.set(Relay.Value.kOn);
        verticalArm.set(Relay.Value.kOn);
        knockBar.set(Relay.Value.kOn);
        knockBarPoker.set(Relay.Value.kOn);
        compressorPower.set(Relay.Value.kOn);*/
    }

    //Runs periodically during teleoperated mode
    public void teleopPeriodic() {
        
    }

    //Runs continuously during teleoperated mode
    public void teleopContinuous() {
        //Drive functions
        vicRight.set(stickOne.getRawAxis(2) / 4);
        vicLeft.set(stickTwo.getRawAxis(2) / 4);

        //Stick one functions
        
        /*transShift.setDirection((stickOne.getRawButton(SONE_HIGH_SPEED) && stickTwo.getRawButton(STWO_HIGH_SPEED)) ? Relay.Direction.kForward : Relay.Direction.kReverse);
        
        
        ballGripper.setDirection(stickOne.getRawButton(SONE_POKE_OPEN_GRIPPER) ? Relay.Direction.kForward : Relay.Direction.kReverse);
        
        ballGripperPoker.setDirection(stickOne.getRawButton(SONE_POKE_OPEN_GRIPPER) ? Relay.Direction.kForward : Relay.Direction.kReverse);
        
        //Stick two functions
        
        //Stick three functions
        
        ballGripper.setDirection(stickThree.getRawButton(STHREE_GRIPPER) ? Relay.Direction.kForward : Relay.Direction.kReverse);
        //ball arm lower here
        
        verticalArm.setDirection(stickThree.getRawButton(STHREE_VERTICAL_ARM) ? Relay.Direction.kForward : Relay.Direction.kReverse);
        
        knockBarPoker.setDirection(stickThree.getRawButton(STHREE_KNOCK_BAR_POKER) ? Relay.Direction.kForward : Relay.Direction.kReverse);

        compressorPower.setDirection(compressorPressure.get() ? Relay.Direction.kReverse : Relay.Direction.kForward);
    */
     }
    
}
