package Mod6Exer1;

import java.util.*;

public class NewMain {

    public static void main(String[] args) {
        Empleat boss = new Empleat("Pepe Boss", "Candelaria 13", "458236956", 100);
        boss.setSouTotal(50);
        
        Empleat volunteer = new Empleat("Toño Volunteer", "Cases Barates 33", "584712361", 0);
        volunteer.setSouTotal(0);
        
        System.out.println(boss);
        System.out.println(volunteer);
    }

}
