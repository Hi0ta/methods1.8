import java.time.LocalDate;

public class Main {

    //задача 1
    public static boolean calculateLeapYear(int year) {
        boolean leapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        return leapYear;
    }

    // задача 2.1
    public static String getYearOfRelease(int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear) {
            return "облегченную";
        }
        return "";
    }

    public static String getClientOS(int ClientOS) {
        if (ClientOS == 0) {
            return "iOS";
        }
        return "Android";
    }

    // задача 2.2
    public static String getTextToPrint(int DeviceYearClient, int OsClient) {
        int currentYear = 2022;
        if (DeviceYearClient < currentYear && OsClient == 0) {
            return "Установите облегченную версию приложения для ios по ссылке";
        }
        if (DeviceYearClient < currentYear && OsClient == 1) {
            return "Установите облегченную версию приложения для Android по ссылке";
        }
        if (DeviceYearClient == currentYear && OsClient == 0) {
            return "Установите текущую версию приложения для ios по ссылке";
        }
        if (DeviceYearClient == currentYear && OsClient == 1) {
            return "Установите текущую версию приложения для Android по ссылке";
        }
        return "Введены параметры вне условий задачи";
    }

    // задача 3

    public static int getNumberOfDeliveryDays(int deliveryDistance) {
        int day = 1;
        int interval = 40;
        int distance = 20;
        if (deliveryDistance <= distance) {
            return day;
        } else {
            day = day + (int) Math.ceil((deliveryDistance - distance) / (double) interval);
            return day;
        }
    }


    public static void main(String[] args) {

        System.out.println("Задача 1");
        int year = 2022;
        boolean leapYear = calculateLeapYear(year);
        if (leapYear) {
            System.out.println("Это високосный год");
        }
        System.out.println("Это не високосный год");


        System.out.println();
        System.out.println("Задача 2.1");

        int ClientOS = 1;
        int clientDeviceYear = 2021;

        String clientOS = getClientOS(ClientOS);
        String YearOfoRelease = getYearOfRelease(clientDeviceYear);
        System.out.println("Установите " + YearOfoRelease + " версию приложения для " + clientOS + " по ссылке");

        System.out.println();
        System.out.println("Задача 2.2");

        int DeviceYearClient = 2022;
        int OsClient = 0;

        String TextToPrint = getTextToPrint(DeviceYearClient, OsClient);
        System.out.println(TextToPrint);


        System.out.println();
        System.out.println("Задача 3");

        int deliveryDistance = 141;

        int day =getNumberOfDeliveryDays(deliveryDistance);
        System.out.println("Потребуется дней: " + day);


    }
}