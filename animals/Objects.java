package animals;

public class Objects {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 12, "Siam", 5, "Very", "blue");
        Dog dog = new Dog("Bobik", 5, "Mops", 20, 12 );
        Horse horse = new Horse("Michail", 2, "Mongol", 2.50, true);
       cat.printInfo();
       dog.printInfo();
       horse.printInfo();

    }


}

