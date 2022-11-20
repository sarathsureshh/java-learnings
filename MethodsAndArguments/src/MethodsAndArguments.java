public class MethodsAndArguments {
    public static void main(String[] args) {

        System.out.println("Sum of three numbers is: " + sumOfTwoNumbers(10, 67, 99));
        System.out.println("The third angle is: " + calculateThirdAngle(20, 89));

    }

    public static int sumOfTwoNumbers(int a, int b, int c) {
        return a + b + c;
    }

    public static int calculateThirdAngle(int angle1, int angle2) {
        int sumOfTwoAngle = angle1 + angle2;
        int angle3 = 180 - sumOfTwoAngle;
        return angle3;
    }
}