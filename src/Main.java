public class Main {
    //Задание 1
    public static void determineLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " является високосным");
        } else {
            System.out.println(year + " не является високосным ");
        }
    }

    public static void suitableVersionOsAndYearProduction(int clientOS, int yearProduction) {
        if (clientOS == 0 || yearProduction < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 || yearProduction >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 || yearProduction < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 || yearProduction >= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("На вашем устройстве установлена ОС не совместимая с Приложением");
        }
    }

    public static int calculateDelivaryDay(int distance) {
        if (distance < 20 && distance > 0) {
            return 1;
        } else if (distance < 60 && distance > 20) {
            return 2;
        } else if (distance < 100 && distance > 60) {
            return 3;
        } else {
            System.out.println("Доставка невозможна");
        }
        return -1;
    }

    public static void main(String[] args) {
        int year = 2018;
        determineLeapYear(year);

        int clientOS = 0;
        int yearProduction = 2003;
        suitableVersionOsAndYearProduction(clientOS, yearProduction);

        int distance = 30;
        ;
        System.out.println(calculateDelivaryDay(distance) + " - количество дней");
    }
}