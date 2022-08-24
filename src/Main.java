import java.time.LocalDate;

public class Main {

    //задача 1
    private static void printLeapYear(int year) {
        boolean leapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        if (leapYear) {
            System.out.println("Это високосный год");
        } else {
            System.out.println("Это не високосный год");
        }
    }

    // задача 2
    //private static String getYearOfRelease(int clientDeviceYear) {
    //  int currentYear = LocalDate.now().getYear();
    // if (clientDeviceYear < currentYear) {
    //   return "облегченную";
    // }
    //return "";
    //}
    // private static String getClientOS(int clientOS) {
    //   if (clientOS == 0) {
    //     return "iOS";
    //}
    //return "Android";
    //}

    // задача 2
    private static void printText(int deviceYearClient, int osClient) {
        int currentYear = LocalDate.now().getYear();
        if (deviceYearClient < currentYear && osClient == 0) {
            System.out.println("Установите облегченную версию приложения для ios по ссылке");
        }
        if (deviceYearClient < currentYear && osClient == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (deviceYearClient == currentYear && osClient == 0) {
            System.out.println("Установите текущую версию приложения для ios по ссылке");
        }
        if (deviceYearClient == currentYear && osClient == 1) {
            System.out.println("Установите текущую версию приложения для Android по ссылке");
        }
        if (deviceYearClient > currentYear || osClient > 1 || osClient < 0) {
            System.out.println("Введены параметры вне условий задачи");
        }

    }

    // задача 3

    private static void printNumberOfDeliveryDays(int deliveryDistance) {
        int day = 1;
        int interval = 40;
        int distance = 20;
        if (deliveryDistance <= distance) {
            System.out.println("Потребуется 1 день");
        } else {
            day = day + (int) Math.ceil((deliveryDistance - distance) / (double) interval);
            System.out.println("Потребуется дней: " + day);
        }
    }


    public static void main(String[] args) {

        System.out.println("Задача 1");
        int year = 2022;
        printLeapYear(year);

        // System.out.println();
        //System.out.println("Задача 2");

        //int clientOS = 1;
        //int clientDeviceYear = 2021;

        //String os = getClientOS(clientOS);
        //String yearOfoRelease = getYearOfRelease(clientDeviceYear);
        //System.out.println("Установите " + yearOfoRelease + " версию приложения для " + os + " по ссылке");

        System.out.println();
        System.out.println("Задача 2");

        int deviceYearClient = 2020;
        int osClient = 0;
        printText(deviceYearClient, osClient);


        System.out.println();
        System.out.println("Задача 3");

        int deliveryDistance = 20;
        printNumberOfDeliveryDays(deliveryDistance);

    }
}