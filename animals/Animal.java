package animals;

public class Animal {
    //Поля родительского класса, использующиеся наследниками должны быть protected
    String name;
    int age;
    String pedigree;

    public Animal(String name, int age, String pedigree) {
        this.name = name;
        this.age = age;
        this.pedigree = pedigree;
    }


}
