package hw_11.task_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

class Build {
private String street;
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
}

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