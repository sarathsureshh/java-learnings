package MotorBike;

public class MotorBike {

    public int speed;
    private int distance;
    private String bikename;
    void start(String bikename){
        this.bikename = bikename;
        System.out.println(this.bikename+" has been started");
    }

    void setSpeed(int speed)
    {
        this.speed = speed;
        System.out.println("The speed is "+this.speed);
    }

    void stop(int speed)
    {
        this.speed = speed;
        System.out.println("Bike has stopped and the speed is "+this.speed);

    }



}