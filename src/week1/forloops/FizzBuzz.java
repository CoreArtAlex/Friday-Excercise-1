package week1.forloops;

public class FizzBuzz {
    public static void Numbers(){
        for (int i = 1; i <= 100; i++){
            // 15 is multiple of both so need to establish the FizzBuzz argument
            if (i % 15 == 0){
                System.out.println("FizzBuzz");
            }else if (i % 5 == 0){
                System.out.println("Buzz");
            }else if (i % 3 == 0){
                System.out.println("Fizz");
            }else
                System.out.println(i);
        }
    }
}
