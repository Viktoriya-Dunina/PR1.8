/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vika;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ПК
 */
public class PassportService {
    private List<Passport> passportList = new ArrayList<>();

    public PassportService(){
        initializePassports();
    }

    // Инициализация списка пропусков
    public void initializePassports() {
        passportList.add(new Passport(445566, "Антонов Андрей Антонович", "сантехник", false));
        passportList.add(new Passport(112134, "Иванов Иван Иванович", "директор", true));
        passportList.add(new Passport(306306, "Яковлева Юлия Аристарховна", "секретарь", false));
        passportList.add(new Passport(305306, "Иванова Елена Петровна", "техник", false));
        passportList.add(new Passport(304306, "Петров Иван Иванович", "бухгалтер", false));
        // Добавьте еще минимум 2 объекта Passport
    }

    // Добавление нового пропуска
    public void addPassport(int number, String fullName, String position, boolean accessAllowed) {
        for (Passport passport : passportList) {
            if (passport.getNumber() == number && !passport.getFullName().equals(fullName)) {
                passportList.remove(passport); // Удаление старого пропуска с тем же номером и разным ФИО
                break;
            }
        }
        passportList.add(new Passport(number, fullName, position, accessAllowed));
        displayPassports();
    }

    // Вывод списка пропусков с сортировкой по ФИО и номеру
    public void displayPassports() {
        System.out.println("Сортировка по ФИО:");
        passportList.stream()
                .sorted(Comparator.comparing(Passport::getFullName))
                .forEach(System.out::println);

        System.out.println("\nСортировка по номеру пропуска:");
        passportList.stream()
                .sorted(Comparator.comparingInt(Passport::getNumber))
                .forEach(System.out::println);
    }

    // Вывод списка всех сотрудников
    public void displayAllEmployees() {
        System.out.println("\nСписок всех сотрудников:");
        for (Passport passport : passportList) {
            System.out.println("Номер: " + passport.getNumber());
            System.out.println("ФИО: " + passport.getFullName());
            System.out.println("Должность: " + passport.getPosition());
            System.out.println("Разрешение доступа: " + (passport.isAccessAllowed() ? "есть" : "нет"));
            System.out.println("-------------------");
        }
    } 
}
