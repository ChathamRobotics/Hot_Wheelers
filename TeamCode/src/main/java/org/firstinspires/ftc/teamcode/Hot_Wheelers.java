package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
/**
 * Created by FIRST on 5/2/2017.
 */

@TeleOp(name="CoolerTeleOP")
public class Hot_Wheelers extends OpMode {
    public DcMotor rightDriveTrain;
    public DcMotor leftDriveTrain;
    public DcMotor collector;

    public void init() {
        rightDriveTrain = hardwareMap.dcMotor.get("RightDriveTrain");
        leftDriveTrain = hardwareMap.dcMotor.get("LeftDriveTrain");
        collector = hardwareMap.dcMotor.get("collector");
    }

    public void start() {

    }

    public void loop() {/*
       if(gamepad1.left_stick_x > gamepad1.left_stick_y) {
           rightDriveTrain.setPower(gamepad1.left_stick_x);
           leftDriveTrain.setPower(-gamepad1.left_stick_x);
       }
       else {
           rightDriveTrain.setPower(gamepad1.left_stick_y);
           leftDriveTrain.setPower(gamepad1.left_stick_y);
       }
       */

        if (gamepad2.left_trigger>0) {
            collector.setPower(gamepad2.left_trigger);
        }
        else {
            collector.setPower(-gamepad2.right_trigger);
        }

        double turnRatio = Math.abs(gamepad1.left_stick_x) * .5;
        double powerRatio = 1 - turnRatio;

        double power = -gamepad1.left_stick_y * powerRatio;
        double turn = gamepad1.left_stick_x  * turnRatio;

        rightDriveTrain.setPower(power + turn);
        leftDriveTrain.setPower(power - turn);


    }
}

