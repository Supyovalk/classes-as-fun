/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package AdvencedAddMutliply;
import java.util.Scanner;

/**
 *
 * @author yuval keshet
 */
public class Automation {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Add/Multiply Constant:");
        int constant = s.nextInt();
        int age = 23;
        AgeAddMultply agechanger = new AgeAddMultply(constant);
        agechanger.PrintAddMultiply(age);
    }
}
