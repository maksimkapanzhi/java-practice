package hw_11.task_2;


import java.util.*;

public class Students {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        students.add("Ivanov");
        students.add("Ivanov");
        students.add("Petrov");
        students.add("Egorov");
        students.add("Egorov");
        Set<String>set = new LinkedHashSet<>(students);
        System.out.println(set);

        Map<String, Integer> sort = new HashMap<String, Integer>();
        for (String temp : students) {
            Integer count = sort.get(temp);
            sort.put(temp, (count == null) ? 1 : count + 1);
        }

        System.out.println(sort);
        }
    }
