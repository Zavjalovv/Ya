public class Main {
    public static void main(String[] args) {


        int clientOS = 1;
        int android = 0;
        int IOS = 1;
        int clientDeviceYear = 2014;
        if (clientDeviceYear >= 2015) {
            System.out.println("Установите актуальную версию приложения Приложения");
        }
        if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию прложения");
        }
        if (clientOS == 0) {
            System.out.println("Скачать приложение для андройд");
        } else {
            clientOS = 1;
            System.out.println("Скачать приложение для Айфон");


        }
        //задача 5
        int season = 6;
        switch (season) {
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
                System.out.println("Такого месяца не существует");
        }
        // Задача 4
        int deliveryDistance = 140;
        int speed = 20;
        int deliveryTime = deliveryDistance / speed;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка занимает сутки");
        } else {
            if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Доставка займет два дня");
            } else {
                if (deliveryDistance > 60 && deliveryDistance <= 100) {
                    System.out.println("Доставка займет три дня");
                } else {
                    if (deliveryDistance > 100) {
                        System.out.println("Доставка займет " + deliveryTime + " дней");
                    }

                }
            }


        } // Задача 3
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Год является високосным ");
        }else {
            System.out.println(" Год не является високосным");
        }


    }
}

