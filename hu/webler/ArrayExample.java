package hu.webler;

public class ArrayExample {

    public static void main(String[] args) {
        //Tömbök jele: [] jele előtt pedig a típus van

        int[] numbers = {1, 2, 3, 4};
        int[] otherNumbers = new int[10];

        System.out.println("Numbers hossz : " + numbers.length);
        System.out.println("Other Numbers hossz : " + otherNumbers.length);

        boolean[] isValid = {true, true, false, false, false, false, true};

        String[] names = {"Anna", "Béla", "Cecília"};

        String[] text = new String[3];

        text[0] = "Hello";
        text[1] = "Webler";
        text[2] = "kurzus";

        System.out.println( text[0] + text[1] + text[2]);

       String[] weblerCurse = new String[5];
        weblerCurse[0] = " ";
        weblerCurse[1] = "!";
        weblerCurse[2] = "Webler";
        weblerCurse[3] = "kurzus";
        weblerCurse[4] = "Hello";
        System.out.println(weblerCurse[4] + weblerCurse[0] + weblerCurse[2] + weblerCurse[0] + weblerCurse[3] + weblerCurse[1]);

        int size = weblerCurse.length;

        System.out.println(size);

        String[] array = new String[32];
        array[2] = "Van érték";
        array[3] = "itt is!";

        System.out.println(array[0]);
        System.out.println(array[2]);

        int[] nums = new int[10];
        nums[5] = -1;
        nums[6] = 0;
        nums[9] = 10;
        System.out.println(nums[0]);
        System.out.println(nums[5]);
        System.out.println(nums[6]);


    }
}
