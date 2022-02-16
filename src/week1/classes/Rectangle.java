package week1.classes;

public class Rectangle {
    public static void Rect(){
        private int width;
        private int height;
        private String color;

        System.out.println(String.format("Enter the width: %d\n", width));
        if (width == 0){
            width = width +1;
            System.out.println(String.format("Width is: %d\n", width));
        }else{
            System.out.println(String.format("Width is: %d\n", width));
        }

        System.out.println(String.format("Enter the height: %d\n", height));
        if (height == 0){
            height = height +1;
            System.out.println(String.format("Height is: %d\n", height));
        }else{
            System.out.println(String.format("Height is: %d\n", height));
        }

        System.out.println(String.format("Enter the color: %s\n", color));
        if (color.length() < 2){
            color = "Blue";
            System.out.println(String.format("Color is: %s\n", color));
        }else if (color.length() > 20){
            color = "Blue";
            System.out.println(String.format("Color is: %s\n", color));
        }else{
            System.out.println(String.format("Color is: %s\n", color));
        }

    }
}
