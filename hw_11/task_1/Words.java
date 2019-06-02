package hw_11.task_1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Words {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("Cat");
        words.add("Dog");
        words.add("Dog");
        words.add("Bear");
        words.add("Mouse");
        words.add("Mouse");
        System.out.println(words);
        Set<String> set=new LinkedHashSet<>(words);
        System.out.println(set);
    }
}
