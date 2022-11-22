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
        hymalayan.setSpeed(150);
        hymalayan.increaseSpeed(20);
        hymalayan.decreaseSpeed(150);
        hymalayan.stop(0);
    }

    public static void xpulse()
    {
        MotorBike xpulse = new MotorBike();
        xpulse.start("Xpulse");
        xpulse.setSpeed(140);
        xpulse.increaseSpeed(20);
        xpulse.decreaseSpeed(150);
        xpulse.stop(0);
    }
}
