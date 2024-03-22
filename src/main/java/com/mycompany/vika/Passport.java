/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vika;

/**
 *
 * @author ПК
 */
public class Passport {
    private int number;
    private String fullName;
    private String position;
    private boolean accessAllowed;

    public Passport(int number, String fullName, String position, boolean accessAllowed) {
        this.number = number;
        this.fullName = fullName;
        this.position = position;
        this.accessAllowed = accessAllowed;
    }

    public int getNumber() {
        return number;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public boolean isAccessAllowed() {
        return accessAllowed;
    }

    @Override
    public String toString() {
        return fullName + ", " + number + ", " + position + ", " + accessAllowed;
    }    
}
