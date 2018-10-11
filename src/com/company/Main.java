package com.company;

import main.it.sevenbits.Point;
import main.it.sevenbits.Section;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static Section[] secArr = new Section[3];
    public static void main (String [] args)
    {
        // What is the best way to create?
//        Point p1 = new Point(10, 5, 6);
//        Point p2 = new Point(8, -5, -3);
//        Section sec = new Section(p1, p2);
//        System.out.println(sec.getLength());

        // Just test
//        p1 = new Point(10);
//        p2 = new Point(8, -5);
//        sec = new Section(p1, p2);
//        System.out.println(sec.getLength());


        secArr[0] = new Section(new Point(10, 5, 6), new Point(5, 4, 7));
        secArr[1] = new Section(new Point(9, 3, 4), new Point(1, 3, 4));
        secArr[2] = new Section(new Point(2, 6, 5), new Point(5, 6, 7));
        ArrayList<Double> list_sections = new ArrayList<>();
        double length;
        for (Section section : secArr){
            length = section.getLength();
            System.out.println("Length: " + length);
            list_sections.add(length);
        }
        System.out.println("Max length: " + Collections.max(list_sections));
    }
}
