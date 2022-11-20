package MotorBike;

public class MotorBikeRunner {

    public static void main(String[] args) {
        himalayan();
        xpulse();
    }

    public static void himalayan()
    {
        MotorBike hymalayan = new MotorBike();
        hymalayan.start("Himalayan");
        hymalayan.setSpeed(40);
        hymalayan.stop(0);
    }

    public static void xpulse()
    {
        MotorBike xpulse = new MotorBike();
        xpulse.start("Xpulse");
        xpulse.setSpeed(20);
        xpulse.stop(0);
    }
}
