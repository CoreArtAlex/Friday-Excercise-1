package week1.forloops;

public class CountingMachine {
    public static void count(int number){
        System.out.println(String.format("Count to: %d\n", number));

        for (int i = 0; i <= number; i++){
            System.out.println(i);
        }
    }
}
