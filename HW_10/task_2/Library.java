package HW_10.task_2;

public class Library {
    private String title;
    private Author author;

    public Library(String title, String author) {
        this.title = title;
        this.author = new Author(author);
    }

    Author author1 = new Author("ZZZ");

    public Library clone() throws CloneNotSupportedException {
        Library newLib = (Book) super.clone();
        newLib.author1 = (Author) author1.clone();
        return newLib;

    }

}
// тут я жестко запутался и буду сидеть разбираться, я просто не хотел пропускать дедлайн
