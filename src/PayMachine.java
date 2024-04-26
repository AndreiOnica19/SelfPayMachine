import java.util.Scanner;

public class PayMachine {
    public static void main(String[] args) {
        System.out.println("Welcome to Kaufland!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Input receipt value: ");
        double receipt = sc.nextDouble();
        System.out.print("Insert money please: ");
        double money = sc.nextDouble();
        double change = money - receipt;
        System.out.println("Your change is " + change + " lei.");

        while (change >= 200) {
            System.out.println("200 lei");
            change -= 200;
        }
        while (change >= 100) {
            System.out.println("100 lei");
            change -= 100;
        }
        while (change >= 50) {
            System.out.println("50 lei");
            change -= 50;
        }
        while (change >= 10) {
            System.out.println("10 lei");
            change -= 10;
        }
        while (change >= 5) {
            System.out.println("5 lei");
            change -= 5;
        }
        while (change >= 1) {
            System.out.println("1 leu");
            change -= 1;
        }
        while (change >= 0.5) {
            System.out.println("0.50 lei");
            change -= 0.5;
        }
        while (change >= 0.1) {
            System.out.println("0.10 lei");
            change -= 0.1;
        }
        while (change >= 0.05) {
            System.out.println("0.01 lei");
            change -= 0.05;
        }
        while (change >= 0.01) {
            System.out.println("0.01 lei");
            change -= 0.01;
        }
    }
}
