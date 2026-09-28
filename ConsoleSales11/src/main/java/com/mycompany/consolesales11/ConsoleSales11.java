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


package com.mycompany.consolesales11;

import java.util.Scanner;

// Interface
interface IConsoles {

    String getConsoleType();

    String getStore();

    int getTotalSales();
}

// Abstract class
abstract class Console implements IConsoles {

    private String consoleType;
    private String store;
    private int totalSales;

    // Constructor
    public Console(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    // Getters
    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return store;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }
}

// Subclass and main class
public class ConsoleSales11 extends Console {

    // Constructor
    public ConsoleSales11(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    // Print report
    public void printReport() {

        System.out.println("\n===== CONSOLE SALES REPORT =====");
        System.out.println("Console Type: " + getConsoleType());
        System.out.println("Store Name: " + getStore());
        System.out.println("Total Sales: R" + getTotalSales());
        System.out.println("================================");
    }

    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("===== CONSOLE SALES SYSTEM =====");
        System.out.println("1.PS5");
        System.out.println("2. XBOX");
        System.out.println("3.SWITCH");

        System.out.print("Select console type: ");
        int choice = input.nextInt();
        input.nextLine();

        String consoleType;

        switch (choice) {

            case 1:
                consoleType = "PS5";
                break;

            case 2:
                consoleType = "XBOX";
                break;

            case 3:
                consoleType = " SWITCH";
                break;

            default:
                consoleType = "Unknown";
                break;
        }

        System.out.print("Enter store name: ");
        String store = input.nextLine();

        System.out.print("Enter total sales of_____"    + consoleType +     "____for____"  + store +  " ____amount: R");
        int totalSales = input.nextInt();

        ConsoleSales11 sales = new ConsoleSales11(
                consoleType,
                store,
                totalSales
        );

        sales.printReport();

        input.close();
    }
}
