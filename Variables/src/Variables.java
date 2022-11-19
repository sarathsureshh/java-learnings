public class Variables {
    public static void main(String[] args) {

        System.out.println(addNumbers());
        concatenateString();
        System.out.println(divideDoubleNumbers());
    }

    public static int addNumbers()
    {
        // int is the keyword which is used to express integers
        int a = 0;
        int b = 90;
        int c = 40;
        //a variable can be undeclared as well
        int f;

        int res = a+b+c;
        return res;
    }

    public static void concatenateString()
    {
        //String is the keyword used to store variables of type string
        String sarath = "Sarath ";
        String d = " is";
        String g = " learning";
        String h = " java";
        //A string can be undeclared as well!
        String joey;

        System.out.println(sarath+d+g+h);
    }

    public static double divideDoubleNumbers()
    {
        //float is the keyword that is used to store decimal values
        double e = 5.0;
        double r = 2.0;

        return e/r;

    }
}