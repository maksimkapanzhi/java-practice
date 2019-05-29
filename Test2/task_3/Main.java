package Test2.task_3;

public class Main {
    public static void main(String[] args) {
        Someclass some = new Someclass("Hello");
        System.out.println(some.getClass());
    }
}
class Someclass<T>{
    private T value;
    public Someclass(T value){
        this.value = value;
    }
}
