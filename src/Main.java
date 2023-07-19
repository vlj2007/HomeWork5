public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1(){
        System.out.println("Задача 1");
        int clientOS = 0;

        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
}