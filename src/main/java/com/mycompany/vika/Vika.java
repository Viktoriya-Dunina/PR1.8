/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vika;

import java.util.Scanner;

/**
 *
 * @author ПК
 */
public class Vika {
public static void main(String[] args) {
            PassportService passportService = new PassportService();
            Scanner scanner = new Scanner(System.in);

            passportService.displayAllEmployees(); // Отображение всех сотрудников перед началом ввода

            while (true) {
                System.out.println("\nВведите данные нового пропуска:");
                System.out.print("Номер: ");
                int number = scanner.nextInt();
                scanner.nextLine(); // consume new line
                System.out.print("ФИО: ");
                String fullName = scanner.nextLine();
                System.out.print("Должность: ");
                String position = scanner.nextLine();
                System.out.print("Разрешение доступа (true/false): ");
                boolean accessAllowed = scanner.nextBoolean();

                passportService.addPassport(number, fullName, position, accessAllowed);
            }
        }
    }
