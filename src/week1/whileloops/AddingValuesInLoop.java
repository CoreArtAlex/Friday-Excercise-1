package week1.whileloops;

public class AddingValuesInLoop {
    public static void Values(int number, int total){
        int i = 0;
        System.out.println("I will add up the numbers you give me.\n");
        System.out.println(String.format("Number: %d\n", number));
        while (number != 0){
            total = (i + number);
            System.out.println(String.format("The total so far is: %d\n", total));
        }
        if (number == 0){
            System.out.println(String.format("The total is: %d\n", total));
        }
    }
}
