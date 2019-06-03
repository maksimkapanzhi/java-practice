package hw_11.task_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

// class Build implements Comparable<Build> {
class Build {
private String street;
    // house, переименуй
private int housNumber;

    public Build(String street, int housNumber) {
        this.street = street;
        this.housNumber = housNumber;
    }

    public String getStreet() {
        return street;
    }

    public int getHousNumber() {
        return housNumber;
    }
    
    // убери комментарий когда заменишь первую строчку класса
//     @Override
//     public int compareTo(Build b) {
//         int comparedStreet = this.getStreet().compareTo(b.getStreet());

//         if(comparedStreet != 0) {
//             return comparedStreet;
//         }

//         return Integer.compare(this.getHousNumber(), b.getHousNumber());
//     }
// }

// лучше выносить в отдельный файл
class BuildStreetComparator implements Comparator<Build>{
    public int compare (Build a, Build b){
        return a.getStreet().compareTo(b.getStreet());
    }
}

class BuildHouseNumberComparator implements Comparator<Build>{
    public int compare (Build a, Build b){
        if (a.getHousNumber()>b.getHousNumber())
            return 1;
        else if (a.getHousNumber()<b.getHousNumber())
            return -1;
        else
            return 0;
    }
}

class Main{
    public static void main(String[] args) {
        Comparator<Build>madSorting = new BuildStreetComparator().thenComparing(new BuildHouseNumberComparator());
        
        // когда заменишь моей версией, передавать компаратор не нужно будет, он уже есть в твоем классе и джава знает как сравнивать объекты
        // такой вариант лучше, т.к. все будет сравниваться одинаково (менять тоже в одном месте) + меньше кода
        // zdania - забудь про русские имена переменных, это можно было делать в начале, сейчас только англ
        TreeSet<Build>zdania = new TreeSet<>(madSorting);
        zdania.add(new Build("Kirova", 7));
        zdania.add(new Build("Kirova", 5));
        zdania.add(new Build("Stoletova", 14));
        zdania.add(new Build("Lenina", 2));
        zdania.add(new Build("Lenina", 12));

        for (Build p: zdania){

            System.out.println(p.getStreet() + " " + p.getHousNumber());
        }



    }
}
