package hw_for1305;

class Car {
    private int transmission = 0;
    private String engine = "Off";

    public Car(int transmission, String engine) {
    }

    public void turnOnEngine(){ //включить двигатель
        if (engine=="On"){
            System.out.println("Мотор уже работает");
        }
        else if(engine=="Off"){
            engine = "On";
            System.out.println("Рррррон-дон-дон");
        }
        }
        public void turnOffEngine(){ //выключить двигатель
        if (engine == "On"){
            engine = "Off";
            System.out.println("Двигатель выключен с");
        }
        if (engine == "Off"){
            System.out.println("Мотор уже выключен");
        }
        }
        public void transUp(){ //повысить передачу
        if (transmission<7) {
            transmission++;
            System.out.print(transmission + " transmission   ");
            System.out.println("SPEED " + transmission*20 + "MPH");
        }
        else{
            System.out.println("У вас всего 7 передач");
        }
        }
        public void transDown(){ //понизить передачу
        if (transmission>0) {
            transmission--;
            System.out.print(transmission + " transmission   ");
            System.out.println("SPEED " + transmission*20 + "MPH");
        }
        else{
            System.out.println("Передача не может быть меньше нуля");
        }
        }
        public void tapGas(){
            System.out.println("Нажали газ");
        }
        public void goToHell(){ //метод для того, чтобы завести машину
        turnOnEngine();
        tapGas();
        transmission = 0;
        transUp();

        }
}

