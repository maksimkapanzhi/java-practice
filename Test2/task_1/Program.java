package Test2.task_1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Button changePinButton = new Button(new ButtonClickHandler());
        changePinButton.click();
        Button checkBalanceButton = new Button(new ButtonClickHandler());
        checkBalanceButton.click();
    }
}
class ButtonClickHandler implements EventHandler{

    public void execute(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your PIN and press \"Enter\" ");
        int yourPin = scanner.nextInt();
        System.out.println("Enter New PIN");
        int newPin = scanner.nextInt();
        System.out.println("PIN is changed");

        int summ = 100; // заглушка на сумму
        String valute = " BYN"; // заглушка на валюту

        System.out.println("If you want to see your ballance, enter your PIN");
        int balance = scanner.nextInt();
        if(balance == newPin){
            System.out.println(summ + valute);
        }
        else{
            System.out.println("Incorrect PIN");
        }
    }

}