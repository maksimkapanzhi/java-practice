package HW_10.task_2;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Library library = new Library("New title", "New author");
        library.clone();
        System.out.println(library);
        System.out.println(library.clone());
    }
}
