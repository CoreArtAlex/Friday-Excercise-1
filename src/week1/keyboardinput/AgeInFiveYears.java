package week1.keyboardinput;

public class AgeInFiveYears {
    public static void Naming(String name, int age){
        int future = age + 5;
        int past = age - 5;
        System.out.println(String.format("Hello.  What is your name? %s\n", name));
        System.out.println(String.format("Hi, %s!  How old are you? %d\n", name, age));
        System.out.println(String.format("Did you know that in five years you will be %d years old?\n" +
                "And five years age you were %d ! Imagine that!", future, past));
    }
}
