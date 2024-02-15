package hu.webler;

public class LoopExample {

    //For loop

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            System.out.println("For loo : " + i);
        }

        //While loop
        int i = 0;
        while (i < 5) {
            System.out.println("While loop: " + i);
            i++;
        }

        int j = 0;

        do {
            System.out.println("Do-whil loop : " + j);
            j++;
        }  while (j < 5) ;



            int[] numbers = {11, 2, 3, 4, 5};
            for (int num : numbers) {
                System.out.println("Enhanced for loop : " + num);
            }

        }


    }

