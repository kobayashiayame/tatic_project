package PracticeDoWhile;

public class Java02 {
    public static void printCountDown() {
        int count = 100;

        do {
            System.out.println(count);
            count--;
        } while (count >= 0);
    }

    public static void main(String[] args) {
        printCountDown();
    }
}