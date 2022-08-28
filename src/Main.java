import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    //задача 1
    private static boolean isLeapYear(int year) {
        boolean leapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        return leapYear;
    }

    private static void printLeapYear(int year) {
        boolean leapYear = isLeapYear(year);
        if (leapYear) {
            System.out.println("Это високосный год");
        } else {
            System.out.println("Это не високосный год");
        }
    }

    // задача 2

    private static boolean isMetCondition(int deviceYearClient, int osClient) {
        int currentYear = LocalDate.now().getYear();
        boolean checkCondition = (osClient > 1 || deviceYearClient > currentYear);
        return checkCondition;
    }

    private static String getYearOfRelease(int deviceYearClient) {
        int currentYear = LocalDate.now().getYear();
        if (deviceYearClient < currentYear) {
            return "облегченную";
        }
        return "";
    }

    private static String getClientOS(int osClient) {
        if (osClient == 0) {
            return "iOS";
        }
        return "Android";
    }

    private static void printText(int deviceYearClient, int osClient) {
        boolean checkCondition = isMetCondition(deviceYearClient, osClient);
        if (checkCondition) {
            System.out.println("Введены параметры вне условий задачи");
        } else {
            // String clientOS = getClientOS(osClient);
            // String YearOfoRelease = getYearOfRelease(deviceYearClient);
            System.out.println("Установите " + getYearOfRelease(deviceYearClient) + " версию приложения для " + getClientOS(osClient) + " по ссылке");
        }
    }

    // задача 3
    private static String getNumberOfDeliveryDays(int deliveryDistance) {
        int day = 1;
        int interval = 40;
        int distance = 20;
        if (deliveryDistance <= distance) {
            return "Потребуется 1 день";
        } else {
            day = day + (int) Math.ceil((deliveryDistance - distance) / (double) interval);
            return "Потребуется дней: " + day;
        }
    }

    private static void printNumberOfDeliveryDays(int deliveryDistance) {
        //String NumberOfDeliveryDays = NumberOfDeliveryDays(deliveryDistance);
        System.out.println(getNumberOfDeliveryDays(deliveryDistance));
    }

    // задача 4
    private static void printInReverseOrder(int[] arrChaoticNumbers) {
        for (int m = arrChaoticNumbers.length - 1; m >= 0; m--) {
            System.out.print(arrChaoticNumbers[m] + ", ");
        }
    }

    // задача 5
    private static String getSymbol(String haotic) {
        int i = 1;
        while (i < haotic.length()) {
            if (haotic.charAt(i) == haotic.charAt(i - 1)) {
                return "задублирован символ " + haotic.charAt(i);
            } else {
                i++;
            }
        }
        return "Дублей нет";
    }

    private static void printNoDouble(String haotic) {
        System.out.println(getSymbol(haotic));
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static int getMonthlyPaymentAmount() {
        int[] arrCosts = generateRandomArray();
        int monthlyPaymentAmount = 0;
        for (int element : arrCosts) {
            monthlyPaymentAmount += element;
        }
        return monthlyPaymentAmount;
    }

    private static double getAverageSpendingPerMonth() {
        int[] arrCosts = generateRandomArray();
        double averageSpendingPerMonth = 0.0;
        averageSpendingPerMonth = getMonthlyPaymentAmount() / arrCosts.length;
        return averageSpendingPerMonth;
    }

    private static void printResult(){
        System.out.println("Сумма трат за месяц составила " + getMonthlyPaymentAmount() + " рублей");
        System.out.println("Средняя сумма трат за день составила " + getAverageSpendingPerMonth() + " рублей");
    }

    public static void main(String[] args) {

        System.out.println("Задача 1");
        int year = 2024;
        printLeapYear(year);

        System.out.println();
        System.out.println("Задача 2");
        int deviceYearClient = 2020;
        int osClient = 0;
        printText(deviceYearClient, osClient);


        System.out.println();
        System.out.println("Задача 3");

        int deliveryDistance = 150;
        printNumberOfDeliveryDays(deliveryDistance);

        System.out.println();
        System.out.println("Задача 4");

        int[] arrChaoticNumbers = {3, 2, 1, 6, 5};
        System.out.println(Arrays.toString(arrChaoticNumbers));
        printInReverseOrder(arrChaoticNumbers);

        System.out.println();
        System.out.println();
        System.out.println("Задача 5");

        String haotic = "abcdefghijk";
        printNoDouble(haotic);


        System.out.println();
        System.out.println("Задача 6");
        printResult();

    }
}