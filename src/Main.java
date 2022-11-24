import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 6. Cycles");
        System.out.println("Part 1");
        System.out.println("Task 1");
        for(int i = 1; i <=10; i++){
            System.out.println(i);
        }
        System.out.println(" ");

        System.out.println("Task 2");
        for (int c = 10; c >= 1; c--) {
            System.out.println(c);
        }
        System.out.println(" ");

        System.out.println("Task 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println(" ");

        System.out.println("Task 4");
        for (int a = 10; a >= -10; a--) {
            System.out.println(a);
        }
        System.out.println(" ");

        System.out.println("Part 2");
        System.out.println("Task 1");
        for (int leapYear = 1904; leapYear <= 2096; leapYear++) {
            if (leapYear % 4 == 0 && leapYear % 4 != 100 || leapYear % 4 == 0) {
                System.out.println(leapYear + " год является високосным");
            }
        }
        System.out.println(" ");

        System.out.println("Task 2");
        for (int subsequence = 7; subsequence <= 98; subsequence = subsequence + 7){
            System.out.println(subsequence);
        }
        System.out.println(" ");

        System.out.println("Task 3");
        for (int v = 1; v <= 512; v = v * 2) {
            System.out.println(v);
        }
        System.out.println(" ");

        System.out.println("Part 3");
        System.out.println("Task 1");
        int deposit = 29000;
        int revenue = 0;
        for (int month = 1; month <= 12; month++) {
            revenue = revenue + deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + revenue + " рублей.");
        }
        System.out.println("Общая сумма накоплений за год равна " + revenue + " рублей.");
        System.out.println(" ");


        System.out.println("Task 2");
        double deposit1 = 29000;
        double revenue1 = 0;
        for (int month1 = 1; month1 <= 12; month1++) {
            revenue1 = revenue1 + revenue1 / 100;
            revenue1 = revenue1 + deposit1;
            String result = String.format("%.2f",revenue1);
            System.out.println("Месяц " + month1 + ", сумма накоплений равна " + result + " рублей.");
        }
    }
}