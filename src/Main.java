import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Task 1
        printLeapYear(2000);

        //Task 2
        int clientOS = 1;
        int deviceYear = 2022;
        printSuggestionForInstall(clientOS, deviceYear);

        //Task 3
        int deliveryDistance = 150;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        System.out.println( " потребуется дней: " + deliveryDays);

    }

    // Task 3

    private static  int calculateDeliveryDays(int deliveryDistance ) {
        int deliveryDays = 1;
        int interval = 40;
        int startInterval = 20;
        if ( deliveryDistance > startInterval) {
            deliveryDays = deliveryDays + (int) Math.ceil((deliveryDistance - startInterval) / (double) interval);
        }
        return  deliveryDays;
    }

    //Task 1
    private static void printLeapYear(int year) {
        String autput;
        if (isLeapYear(year)) {

            autput = year + " год является высокосным";
        } else {
            autput = year + " год не является высокосным";
        }
        System.out.println(autput);
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    //Task 2

    private static void printSuggestionForInstall(int clients, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        String output;
        if (deviceYear < currentYear) {
            output = " Установите облегченную версию приложения для ";

        } else {
            output = " Установите версию приложения для ";

        }
        if (clients == 1) {
            output += "Android по ссылке ";
        } else {
            output += " IOS по ссылке ";
        }
        System.out.println( output);


    }






}





































