/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.studentresult;
import java.util.Scanner;

public class StudentResult {

    public static void main(String[] args) {
        int m1, m2, m3, total;
        double avg;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of 3 subjects: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();

        total = m1 + m2 + m3;
        avg = total / 3.0;

        System.out.println("Total = " + total);
        System.out.println("Average = " + avg);

        if (avg >= 50)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");

        sc.close();
    }
}
    
