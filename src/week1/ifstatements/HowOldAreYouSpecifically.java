package week1.ifstatements;

public class HowOldAreYouSpecifically {
    public static String Driving(String name, int age){
        System.out.println(String.format("Hey, what's your name? " +
                "(Sorry, I keep forgetting.) %s\n", name));
        System.out.println(String.format("Ok, %s, how old are you? %d\n", name, age));

        if (age < 16){
            System.out.println(String.format("You can't drive %s\n", name));
        }else if (age >= 16 && age <= 17){
            System.out.println(String.format("You can drive but not vote, %s\n",
                    name));
        }else if (age >= 18 && age <= 24){
            System.out.println(String.format("You can vote but not rent a car, %s\n",
                    name));
        }else{
            System.out.println(String.format("You can do pretty much anything, %s\n",
                    name));
        }
        return "";
    }

}
