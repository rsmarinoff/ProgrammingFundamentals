/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.softuni.homeworkassignments.vol1;

public class CenturiesConverter {

    public static String convertCenturies(int centuries) {
        return "" + centuries + " centuries = " + 100 * centuries + " years = " + (int) (36524.22 * centuries) + " days = " + (int) (24 * (int) (36524.22 * centuries)) + " hours = " + (int) (60 * 24 * (int) (36524.22 * centuries)) + " minutes";
    }

}
