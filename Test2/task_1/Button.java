package Test2.task_1;

public class Button {
    EventHandler eventHandler;

    Button(EventHandler action){
        this.eventHandler = action;
    }
    public void click(){
        eventHandler.execute();
    }
}
