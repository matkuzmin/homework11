import java.time.LocalDate;

public class Main {
    public static void yearCheck(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void deliveryDays(int deliveryDistance, int deliveryTime) {

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime += 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime += 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Доставки нет");
        }

    }

    public static void appVerification(int clientOS, int currentYear) {
        if (currentYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (currentYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (currentYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }




    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int years = 2022;
        yearCheck(years);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int currentYear = LocalDate.now().getYear();
        appVerification(clientOS, currentYear);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        int deliveryTime = 1;
        deliveryDays(deliveryDistance, deliveryTime);
    }



}






