/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarepo;

import java.util.Scanner;

/**
 *
 * @author Akinwale.Agbaje
 */
public class JavaRepo {

    /**
     * @param args the command line arguments
     */
    static int n;
    public static void main(String[] args) {
        //i seek a conflict
        System.out.println("My repo0");
        System.out.println("Love sucks");
   Scanner input = new Scanner(System.in);
        System.out.print("Enter the upper limit of the value ");
        n = input.nextInt();
        System.out.print("Number\t"+"Square\t"+"Cube\t\n");
        for(int i=1; i<=n; i++){
        System.out.print(i+"\t\t" + square(i) + "\t\t" + cube(i)+"\n");
        }

    }

    static long cube(int i) {
        long rr = i*i*i;
        return rr;
    }

    static int square(int i) {
        int r = i * i;
        return r;
    }
    
}