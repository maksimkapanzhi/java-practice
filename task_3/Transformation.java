package hw_3.task_1.task_3;

public class Transformation {
    public static void main(String[] args) {
        String exampleString = ("Whara is my dog+");
        String newString = exampleString.replace('a', 'e');
        String finalString = newString.replace('+', '?');
        System.out.println(finalString);

    }

}
