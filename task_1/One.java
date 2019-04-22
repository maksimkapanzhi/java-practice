package hw_3.task_1.task_1;

public class One {
        public static void main(String[] args) {
                // имена переменных должны быть говорящими, никаких 'i', например, inputNumber
            int i = Integer.parseInt(args[0]);
                // лучше не использовать русские слова для имен переменных
            int otvet =  (i<<8);
            System.out.println(otvet);
        }
    }


