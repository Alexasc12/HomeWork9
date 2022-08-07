public class Main {
    public static void main(String[] args) {
        int year = 2020;
        Main homework = new Main();
        homework.isLeapYearstoPrint(year);

        Main homework2 = new Main();
        homework2.getYearsAndSystem(2012, 0);
        int distans = 70;
        Main homework3 = new Main();
        homework3.deliveryDays(distans);

        System.out.println(homework3.deliveryDays(distans) + " дня время доставки");



    }

    public void isLeapYearstoPrint(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("год високосный " + year);
        } else System.out.println("Год не високосный " + year);

    }

    public void getYearsAndSystem(int year1, int Os) {
        if (year1 < 2015 && Os == 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (year1 < 2015 && Os == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (year1 > 2015 && Os == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (year1 > 2015 && Os == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");

        }
    }
    public int deliveryDays(int distans) {
        if (distans < 20 && distans > 0) {
            return 1;
        } else if (distans <= 60 && distans >= 20) {
            return 2;
        } else if (distans <= 100 && distans > 60) {
            return 3;
        } else {
            System.out.println(" Доставка не возможна ");
            return -1;
        }
    }

}







