public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        int clientOS = 1; // 0 - iOS, 1 - Android
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        int clientOS = 1; // 0 - iOS, 1 - Android
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        int year = 1900;
        if ((year % 4 == 0 || year % 400 == 0) && year % 100 != 0) {
            System.out.println(year + " год является високосным!");
        } else {
            System.out.println(year + " год не является високосным!");
        }
    }

    public static void task4() {
        int deliveryDistance = 95;
        int fastestDeliveryPeriod = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + fastestDeliveryPeriod);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (fastestDeliveryPeriod + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (fastestDeliveryPeriod + 2));
        }
    }

    public static void task5() {
        int monthNumber = 1;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
        }
    }

    public static void task6() {
        int age = 19;
        int salary = 58_000;
        int salaryMultiplier1 = 3;
        int salaryMultiplier2 = 2;
        float limitMultiplier1 = 1.2f;
        float limitMultiplier2 = 1.5f;
        if (age >= 23) {
            if (salary >= 50_000 && salary < 80_000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (int) (salary * salaryMultiplier1 * limitMultiplier1) + " рублей");
            } else if (salary >= 80_000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (int) (salary * salaryMultiplier1 * limitMultiplier2) + " рублей");
            } else {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * salaryMultiplier1 + " рублей");
            }
        }
        if (age < 23) {
            if (salary >= 50_000 && salary < 80_000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (int) (salary * salaryMultiplier2 * limitMultiplier1) + " рублей");
            } else if (salary >= 80_000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (int) (salary * salaryMultiplier2 * limitMultiplier2) + " рублей");
            } else {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * salaryMultiplier2 + " рублей");
            }
        }
    }

    public static void task7() {
        int age = 35;
        int salary = 90_000;
        int wantedSum = 330_000;
        double maxSalaryPaymentMonth = salary * 0.5;
        double creditRatePercentYear = 10;
        int creditPeriodMonth = 12;
        if (age < 23) {
            creditRatePercentYear = (creditRatePercentYear + 1);
        } else if (age >= 23 & age < 30) {
            creditRatePercentYear = (creditRatePercentYear + 0.5);
        }
        if (salary > 80_000) {
            creditRatePercentYear = (creditRatePercentYear - 0.7);
        }
        double maxCreditPaymentMonth = wantedSum * (1 + (creditRatePercentYear / 100)) / creditPeriodMonth;
        if (maxSalaryPaymentMonth > maxCreditPaymentMonth) {
            System.out.println("Максимальный платеж при ЗП " + salary + " рублей равен " + (int)maxSalaryPaymentMonth + " рублей. Платеж по кредиту " + (int)maxCreditPaymentMonth + " рублей. Кредит одобрен");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary + " рублей равен " + (int)maxSalaryPaymentMonth + " рублей. Платеж по кредиту " + (int)maxCreditPaymentMonth + " рублей. В кредите отказано");
        }
    }
}