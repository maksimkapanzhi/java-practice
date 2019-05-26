package HW_10.task_2;

public class Book extends Library implements Cloneable {
    int year;
    public Book(String title, String author, int year){
        super(title, author);
        this.year = year;
    }
    }

