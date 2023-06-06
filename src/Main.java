import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }
    public static void task1(){
        System.out.println(" ");
        System.out.println("Exercise 1");

        for(int i = 1; i <= 10; i++ ){
            System.out.println(i);
        }
    }
    public static void task2(){
        System.out.println(" ");
        System.out.println("Exercise 2");

        for(int i = 10; i >= 1; i--){
            System.out.println(i);
        }
    }
    public static void task3(){
        System.out.println(" ");
        System.out.println("Exercise 3");

        for (int i = 0; i < 17; i += 2){
            System.out.println(i);
        }
    }
    public static void task4(){
        System.out.println(" ");
        System.out.println("Exercise 4");

        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }
    }
    public static void task5(){
        System.out.println(" ");
        System.out.println("Exercise 5");

        for (int i = 1904; i <= 2096; i += 4){
            System.out.println(i + " год является высокосным");
        }

    }
    public static void task6(){
        System.out.println(" ");
        System.out.println("Exercise 6");

        for (int i = 7; i < 100; i +=7){
            System.out.println(i);
        }

    }
    public static void task7(){
        System.out.println(" ");
        System.out.println("Exercise 7");

        for (int i = 2; i < 520; i *= 2){
            System.out.println(i);
        }
    }
    public static void task8(){
        System.out.println(" ");
        System.out.println("Exercise 8");

        int salary = 29000;
        int total = 0;

        for(int i = 1; i <= 12; i++){
            total += salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task9(){
        System.out.println(" ");
        System.out.println("Exercise 9");

        int salary = 29000;
        int total = 0;

        for (int i = 1; i <= 12; i++){
            total += salary;
            total += total * 0.12;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task10(){
        System.out.println(" ");
        System.out.println("Exercise 10");

        int num = 2;
        for (int i = 1; i <= 10; i++){
            int result = num * i;
            System.out.println(num + " * " + i + " = " + result);
        }
    }
}