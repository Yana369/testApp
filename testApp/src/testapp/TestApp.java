/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testapp;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TestApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("1st num: ");
        double a = Double.valueOf(in.nextLine());
        System.out.print("2st num: ");
        double b = Double.valueOf(in.nextLine());
        System.out.println("a+b="+(a+b));
        System.out.println("Git test apllication");
    }
    
}
