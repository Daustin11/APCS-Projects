/**
 * ---------------------------------------------------------------------------
 * S-h-e-n-e-n-d-e-h-o-w-a--H-i-g-h--S-c-h-o-o-l--T-e-c-h-n-o-l-o-g-y--D-e-p-t
 * ---------------------------------------------------------------------------
 * FILE: Assignment5
 *
 * DATE:  Oct 29, 2021
 *
 * PURPOSE: Boxprint and print roots
 *
 * @author Daniel Broberg
 * ---------------------------------------------------------------------------
 */
package assignment5;

public class DABUtilities {

    public static void printRoots() {
        for (int i = 1; i <= 1000; i++) {
            double a = Math.sqrt(i);//do the math
            System.out.print(+i);//print answers
            System.out.print("\t");//formating
            System.out.print(+a);
            System.out.println("");
        }
    }

    public static void outputBoxedStr(String message) {
        int width = message.length();//CALCULATE message length
        if (width > 20) {
            message = message.substring(0, 20);//cut down message if it is longer than 20 characters
        }
        width = width + 5;//width of top bar
        int sides = width - 4;//space between sides
        for (int i = 0; width >= i; i++) {
            System.out.print("@");//print top bar
        }
        System.out.println("");//jump to next line
        System.out.print("@@");//print side
        for (int i = 0; sides >= i; i++) {
            System.out.print(" ");//print spaces
        }
        System.out.println("@@");//print side
        System.out.print("@@ " + message);//print message
        System.out.print(" @@");
        System.out.println("");
        System.out.print("@@");//print sides
        for (int i = 0; sides >= i; i++) {
            System.out.print(" ");//print spaces
        }
        System.out.print("@@");//print side
        System.out.println("");//jump to next line
        for (int i = 0; width >= i; i++) {
            System.out.print("@");//print bottom
        }
        System.out.println("");//jump to next line
    }
}
