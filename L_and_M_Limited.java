/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.l_and_m_limited;
import java.util.Scanner;
/**
 *
 * @author maste
 */
public class L_and_M_Limited {
    int num1, num2, num3;
    int sum;
    int product;
    int max;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the 2nd number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the 3rd number: ");
        int num3 = scanner.nextInt();

        int product = num1 * num2 * num3;
        int sum = num1 + num2 + num3;
        int max = Math.max(num1, Math.max(num2, num3));

        System.out.println("Product\tSum\tMaximum");
        System.out.printf("%d\t%d\t%d%n", product, sum, max);

        scanner.close();
    }
}
