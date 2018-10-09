/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Stack;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author E304
 */
public class pila {

    public static void main(String[] args) {

        String exp = JOptionPane.showInputDialog("Escriba una expresión");
        Stack<Character> exps = new Stack();
        try {
            for (int i = 0; i < exp.length(); i++) {
                if (i == 0 && exp.charAt(i) == ')') {
                    break;
                } else if (exp.charAt(i) == '(') {
                    exps.push(exp.charAt(i));
                } else if (exp.charAt(i) == ')') {
                    exps.pop();
                }
            }

            if (exps.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Expresion Correcta");
            } else {
                JOptionPane.showMessageDialog(null, "Expresion Fallida");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Expresion Fallida");
        }

    }
}
