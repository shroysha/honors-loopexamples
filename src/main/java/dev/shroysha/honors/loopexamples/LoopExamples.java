package dev.shroysha.honors.loopexamples;

public class LoopExamples {

    public static void main(String[] args) {
        int x = 1;
        while (x < 5) {
            System.out.println("while Hello");
            x++;
        }

        x = 1;
        do {
            System.out.println("do Hello");
            x++;
        } while (x < 5);

        for (x = 1; x < 5; x++) {
            System.out.println("for hello");
        }

    }

}
