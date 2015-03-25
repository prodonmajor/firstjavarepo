/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarepo;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class SecondJavaRepo {
public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to git tutorial using netbeans");
       String sname= JOptionPane.showInputDialog("Your surname please");
        String oname= JOptionPane.showInputDialog("Your last name please");
        String fname= sname+" "+oname;
        JOptionPane.showMessageDialog(null, "Your fullname is"+" "+fname);
    } 
}
