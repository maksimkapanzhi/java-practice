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
        /*
        1. Тебе не нужен здесь LinkedHashSet (он сохраняет порядок добавления элементов)
        2. если ты зайдешь в конструктор LinkedHashSet, который принимает коллекцию,
        то там вызывается метод addAll() и затем через итератор добавляются элементы
        Выводы:
        1. HashSet будет достаточно
        2. Можно и самому все добавить
        */
        Set<String> set=new LinkedHashSet<>(words);
        System.out.println(set);
    }
}
