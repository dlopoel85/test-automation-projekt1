package hu.webler;

public class PrimitivVariableExample {

    public static void main(String[] args) {

    byte num1 = 0;

    short num2 = 2;

    int num3 = 3;

    long num4 = 0L;

    float num5 = 0.0f;

    double num6 = 0.0;


     //   char letter1 = '\u0000';
    char letter1 = '\u0000';
    char letter2 = 'b';

    boolean isValid = false;

        // Változók kiíratása új sorba
        System.out.println("byteVariable: " + num1);
        System.out.println("shortVariable: " + num2);
        System.out.println("intVariable: " + num3);
        System.out.println("longVariable: " + num4);
        System.out.println("floatVariable: " + num5);
        System.out.println("doubleVariable: " + num6);
        System.out.println("charVariable: " + letter1);
        System.out.println("char2: " + letter2);
        System.out.println("booleanVariable (érvényes): " + isValid);

        System.out.println("byteVariable: \t" + num1);

        System.out.println("--------------------------------");

        System.out.println("byteVariable: \n" + num1);

        //Formázás

        int number = 10;

        double value = 3.14159;

        System.out.printf("A szám: %d, az érték: %.2f", number, value);





    }



}
