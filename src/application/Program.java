package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many number you want to input? = ");
        int inputs = sc.nextInt();

        double[] numbers = new double[inputs];
        double sum = 0;
        double average = 0;

        for (int i = 0; i < inputs; i++) {
            System.out.print("Input a number = ");
            numbers[i] = sc.nextDouble();
            sum += numbers[i];
        }

        average = (sum / inputs);

        System.out.print("Numbers = ");
        for (int i = 0; i < inputs; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
