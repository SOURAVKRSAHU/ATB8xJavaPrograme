package OCTOBER;

public class WrapperClass {

    public static void main(String[] args) {

        Integer X = new Integer(10);
        Integer Y = 10;

        // Due to auto-boxing, a new Wrapper object
        // is created which is pointed by Y
        System.out.println(X);
        System.out.println(Y);



    }
}
