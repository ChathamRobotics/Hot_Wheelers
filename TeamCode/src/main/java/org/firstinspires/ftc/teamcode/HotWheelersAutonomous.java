package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
/**
 * Created by FIRST on 5/5/2017.
 */

@Autonomous(name="Auto")
public class HotWheelersAutonomous extends LinearOpMode{
    public DcMotor rightDriveTrain;
    public DcMotor leftDriveTrain;
    public DcMotor collector;

    @Override
    public void runOpMode() throws InterruptedException {

        rightDriveTrain = hardwareMap.dcMotor.get("RightDriveTrain");
        leftDriveTrain = hardwareMap.dcMotor.get("LeftDriveTrain");
        collector = hardwareMap.dcMotor.get("collector");

        waitForStart();

        rightDriveTrain.setPower(-1);
        leftDriveTrain.setPower(-1);
        sleep(5500);
        rightDriveTrain.setPower(0);
        leftDriveTrain.setPower(0);

    }

}

