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
        
        /*
        не забывай удалять ненужные строки кода, set ты никак не используешь
        */
        Set<String>set = new LinkedHashSet<>(students);
        System.out.println(set);

        //new HashMap<>(); - лучше так. Суть таже, текста меньше
        // sort - это значит отсортирована, а это не так. стоит переименовать, например groupedBySurname
        Map<String, Integer> sort = new HashMap<String, Integer>();
        for (String temp : students) {
            Integer count = sort.get(temp);
            sort.put(temp, (count == null) ? 1 : count + 1);
            
            // старайся избегать тернарного оператора, тем более с такими вложенностями, очень трудно такой код читать
            /*
            if (sort.containsKey(temp)) {
                Integer count = sort.get(temp);
                sort.put(temp, ++count);
            } else {
                sort.put(temp, 1);
            }
            */
        }

        System.out.println(sort);
        }
    }
