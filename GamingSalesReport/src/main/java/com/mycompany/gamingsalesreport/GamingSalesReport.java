/**
 * Code Attribution / References:
 *
 * 1. Oracle. "Classes and Objects."
 *    Used for understanding classes, objects,
 *    constructors, getters and setters.
 *    https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html
 *
 * 2. Oracle. "Arrays."
 *    Used for understanding one-dimensional and
 *    multidimensional arrays.
 *    https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
 *
 * 3. Oracle. "The if-then and if-then-else Statements."
 *    Used for understanding conditional statements.
 *    https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html
 *
 * 4. Oracle. "The for Statement."
 *    Used for understanding loops and array traversal.
 *    https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
 *
 * 5. Oracle. "The while and do-while Statements."
 *    Used for understanding while loops and menu repetition.
 *    https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html
 *
 * 6. Oracle. "Scanner Class Documentation."
 *    Used for understanding keyboard input.
 *    https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Scanner.html
 *
 * 7. Oracle. "Random Class Documentation."
 *    Used for understanding random number generation.
 *    https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/util/Random.html
 *
 * 8. Oracle. "String Class Documentation."
 *    Used for understanding String comparison and String methods.
 *    https://docs.oracle.com/en/java/javase/26/docs/api/java.base/java/lang/String.html
 *
 * These references were used for learning and understanding
 * the Java concepts implemented in this program.
 *
 * @author moosa
 */



package com.mycompany.gamingsalesreport;

public class GamingSalesReport {

    public static void main(String[] args) {

        // single-dimensional array for cities
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};

        // single-dimensional array for consoles
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        //two-dimensional array for sales
        int[][] sales = {
            {100, 200, 300},
            {200, 300, 400},
            {150, 110, 120}
        };

        //single-dimensional array for city totals
        int[] cityTotals = new int[cities.length];

        //  gaming console report
        System.out.println("==============================================");
        System.out.println("       NUMBER 1 ELECTRONICS");
        System.out.println("          GAMING CONSOLE REPORT");
        System.out.println("==============================================");

      
        System.out.printf("%-20s", "CITY");

        for (int i = 0; i < consoles.length; i++) {
            System.out.printf("%-12s", consoles[i]);
        }

        System.out.println();

        // Display the sales for each city
        for (int i = 0; i < cities.length; i++) {

            System.out.printf("%-20s", cities[i]);

            for (int j = 0; j < consoles.length; j++) {
                System.out.printf("%-12d", sales[i][j]);

                // Calculate the total sales for each city
                cityTotals[i] += sales[i][j];
            }

            System.out.println();
        }

        // Display the total sales for each city
        System.out.println();
        System.out.println("==============================================");
        System.out.println("TOTAL SALES FOR EACH CITY");
        System.out.println("==============================================");

        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i] + ": " + cityTotals[i]);
        }

        // city with the most sales
        int highestSales = cityTotals[0];
        int highestCityIndex = 0;

        for (int i = 1; i < cityTotals.length; i++) {

            if (cityTotals[i] > highestSales) {
                highestSales = cityTotals[i];
                highestCityIndex = i;
            }
        }

        // Display the city with the most sales
        System.out.println();
        System.out.println("==============================================");
        System.out.println("CITY WITH THE MOST SALES: "
                + cities[highestCityIndex]);
        System.out.println("TOTAL SALES: " + highestSales);
        System.out.println("==============================================");
    }
}