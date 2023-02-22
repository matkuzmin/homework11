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

    public static void reversal(int[] name) {
        for (int i = name.length - 1; i >= 0; i--) {
            System.out.print(name[i]);
        }
    }

    public static void repeats(String rep) {
        char[] result = rep.toCharArray();
        for (int i = 0; i < result.length - 1; i++) {
            if (result[i] == result[i + 1]) {
                System.out.print("В строке есть дубли - " + result[i]);
                break;
            }
            else {
                System.out.println("Дублей нет");

            }
        }
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static int sum(int[] array){
        int money = 0;
        for (int i = 0; i < array.length; i++) {
            money= money+array[i];
        }
        return money;
    }
    public static float averageSum (float total,int [] array){
        float avarage = total/ array.length;
        return avarage;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
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

    public static void task4() {
        System.out.println("Повышенный уровень. Задание 4");
        int[] reverseFullName = {3, 2, 1, 6, 5};
        reversal(reverseFullName);
        System.out.println();
    }

    public static void task5() {
        System.out.println("Повышенный уровень. Задание 5");
        String one = "aabccddefgghiijjkk";
        repeats(one);
        System.out.println();

    }
    public static void task6() {
        System.out.println("Повышенный уровень. Задание 6");
        int[] arr = generateRandomArray();
        sum(arr);
        int total = sum(arr);
        averageSum(total,arr);
        float averageFinal = averageSum(total,arr);
        System.out.println("Средняя сумма трат за месяц составила " + averageFinal + " рублей");
    }

}






