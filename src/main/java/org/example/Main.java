package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static String getGroupCategory(int age){
        if (age <= 0 ) {return "Invalid age";}
        if (age<18) {
            return "ты маленький мальчик";
        } else if (age < 35) {
            return "ты взросли";
        } else {
            return "хайпует плесень";
        }
    };

    public static void main(String[] args) {

    }
}