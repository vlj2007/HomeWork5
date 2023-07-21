import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 0;
        int clientDeviceYear = 2015;

        if (clientOS == 0) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == 1) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

    }

    public static void task3(){
        System.out.println("Задача 3");
        int year = 2132;
        boolean whatYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        if (whatYear){
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

    }


    public static void task4(){
        System.out.println("Задача 4");
        int deliveryDistance = 101;
        if (deliveryDistance <=20){
                System.out.println("Потребуется 1 день.");
        } else if (deliveryDistance >= 21 && deliveryDistance <= 60){
            System.out.println("Потребуется 2 дня");
        } else if(deliveryDistance >= 61 && deliveryDistance <= 100){
            System.out.println("Потребуется 3 дня");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставка нет производится");
        }
    }

    public static void task5(){
        System.out.println("Задача 5");
        int monthNumber = 11;
        String season;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                season = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осень";
                break;
            default:
                season = "Такого месяца нет в календаре";
        }
        System.out.println(season +  " - " + monthNumber + " месяц.");
    }
}