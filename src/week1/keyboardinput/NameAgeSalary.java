package week1.keyboardinput;

public class NameAgeSalary {
    public static String Naming2(String name, int age, float salary){
        System.out.println("Hello, what is your name?");
        System.out.println(name);
        System.out.println(String.format("Hi %s ! How old are you?", name));
        System.out.println(age);
        System.out.println(String.format("So you're %d , eh? That's not old at all!\n" +
                "How much do you make %s", age, name, salary));
        String result = String.format("%f! I hope that's per hour and not per year! LOL!");

        return result;
    }
}
