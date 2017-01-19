/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.softuni.homeworkassignments.vol1;

import java.util.Scanner;

public class JavaApp {

    private static final Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) {
        double radius = Double.parseDouble(SCAN.nextLine());
        System.out.format("%.12f", CircleArea.calculateArea(radius));
    }

}
